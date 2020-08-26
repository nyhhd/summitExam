package com.summitexam.manager.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.summitexam.bean.User;
import com.summitexam.bean.UserExample;
import com.summitexam.bean.UserExample.Criteria;
import com.summitexam.common.JsonUtils;
import com.summitexam.common.ResultVO;
import com.summitexam.dao.UserMapper;
import com.summitexam.manager.service.IUserService;
import com.summitexam.manager.service.jedisclient.JedisClient;


@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private UserExample userExample;
	@Autowired
	private JedisClient jedisClient;
	@Value("${SESSION_KEY}")
	private String SESSION_KEY;
	@Value("${SESSION_EXPIE}")
	private Integer SESSION_EXPIE;
	@Value("${TOKEN_KEY}")
	private String TOKEN_KEY;
	
	@Override
	public List<User> getUsers(User user) {
		// TODO Auto-generated method stub
		Criteria userCriteria = userExample.createCriteria();
		
		//type等于1代表管理员查询非管理员用户信息   type等于2代表出题者查询考生信息   
		if(user.getType() != null && user.getType() == 1) {
			if(null != user.getUserUsername() && user.getUserUsername() != "") {
				userCriteria.andUserUsernameLike("%"+user.getUserUsername()+"%");
			}
			List<String> list = new ArrayList<String>();
			list.add("2");
			list.add("3");
			userCriteria.andUserRoleIdIn(list);
		}else if(user.getType() != null && user.getType()== 2) {
			List<String> list = new ArrayList<String>();
			list.add("3");
			userCriteria.andUserRoleIdIn(list);
		}else {
			if(null != user.getUserNickname() && user.getUserNickname() != "") {
				userCriteria.andUserNicknameEqualTo(user.getUserNickname());
			}
			if(null != user.getUserUsername() && user.getUserUsername() != "") {
				userCriteria.andUserUsernameEqualTo(user.getUserUsername());
			}
			if(null != user.getUserPassword()) {
				userCriteria.andUserPasswordEqualTo(user.getUserPassword());
			}
			if(null != user.getUserId()) {
				userCriteria.andUserIdEqualTo(user.getUserId());
			}
		}
		List<User> users = userMapper.selectByExample(userExample);
		userExample.clear();
		return users;
	}
	
	@Override
	public String insertUser(User user) {
		// TODO Auto-generated method stub
		User user1 = new User();
		user1.setUserUsername(user.getUserUsername());
		List<User> users = getUsers(user1);
		if(users != null && users.get(0) != null) {
			return "存在相同的用户登录名";
		}else {
			int i = userMapper.insert(user);
			return i+"";
		}
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		int i = userMapper.deleteByPrimaryKey(id);
		return true;
	}

	@Override
	public boolean updateUser(User user) {
		userExample.clear();
		// TODO Auto-generated method stub
		Criteria criteria = userExample.createCriteria();
		criteria.andUserIdEqualTo(user.getUserId());
		user.setUpdateTime(new Date());
		int i = userMapper.updateByExample(user, userExample);
		return true;
	}

	@Override
	public ResultVO login(String username, String password) {
		// TODO Auto-generated method stub
		// 1、根据用户名查询用户信息
		UserExample example = new UserExample();
		Criteria criteria = example.createCriteria();
		//查询条件
		criteria.andUserUsernameEqualTo(username);
		List<User> list = userMapper.selectByExample(example);
		example.clear();
		if (list == null || list.size() == 0) {
			return new ResultVO(400, "用户名或密码不正确");
		}
		//取用户信息
		User user = list.get(0);
//		 2、密码校验需要进行md5加密。
		if (!DigestUtils.md5DigestAsHex(password.getBytes()).equals(user.getUserPassword())) {
			return new ResultVO(400, "用户名或密码不正确");
		}
		// 3、生成token
		String toke = UUID.randomUUID().toString();
		// 4、把用户信息写入redis
		//		user.setUserPassword(null);
		jedisClient.set(SESSION_KEY + ":" + toke, JsonUtils.objectToJson(user));
		//设置Session的有效期
		jedisClient.expire(SESSION_KEY + ":" + toke, SESSION_EXPIE);
		// 5、返回token

		return new ResultVO(200,"登录成功",toke,user);
	}

	@Override
	public ResultVO checkUser(String token) {
		//到redis中查询用户信息
		String json = jedisClient.get(SESSION_KEY + ":" + token);
		//判断结果是否为空
		if (StringUtils.isNotBlank(json)) {
			//转换成java对象
			User user = JsonUtils.jsonToPojo(json, User.class);
			//重置过期时间
			jedisClient.expire(SESSION_KEY + ":" + token, SESSION_EXPIE);
			return new ResultVO<>(user);
		}
		//Session已经过期
		return new ResultVO<Object>(201, "用户已经失效");
	}

	@Override
	public ResultVO dataCheck(String param, int type) {
		Criteria criteria = userExample.createCriteria();
		// 判断数据类型
		//1、2、3分别代表username、phone、email
		if (type == 1) {
			criteria.andUserUsernameEqualTo(param);
		} else if (type == 2) {
			criteria.andUserPhoneEqualTo(param);
		} else if (type == 3) {
			criteria.andUserEmailEqualTo(param);
		}
		//执行查询
		List<User> list = userMapper.selectByExample(userExample);
		userExample.clear();
		//判断返回结果是否为空
		if (list == null || list.isEmpty()) {
			//此数据可用，返回true
			return new ResultVO<>(200,"此数据可用");
		}
		if (type == 1) {
			return new ResultVO<>(300,"用户登录名重复,不可用");
		} else if (type == 2) {
			return new ResultVO<>(300,"手机号重复,不可用");
		} else {
			return new ResultVO<>(300,"邮箱重复,不可用");
		}
	}
	
	
	@Override
	public ResultVO register(User user) {
		//补全属性
		user.setCreateTime(new Date());
		user.setUpdateTime(new Date());
		//密码进行md5加密
		String passowrdMd5 = DigestUtils.md5DigestAsHex(user.getUserPassword().getBytes());
		user.setUserPassword(passowrdMd5);
		//注册默认为学生权限
		user.setUserRoleId("3");
		//插入数据库
		userMapper.insert(user);
		
		return new ResultVO<>();
	}

	@Override
	public User selectUser(int id) {
		// TODO Auto-generated method stub
		User user = userMapper.selectByPrimaryKey(id);
		return user;
	}
}

