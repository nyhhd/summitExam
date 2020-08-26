package com.summitexam.manager.service;

import java.util.List;

import com.summitexam.bean.User;
import com.summitexam.common.ResultVO;

public interface IUserService {
	User selectUser(int id);
	List<User> getUsers(User user);
	String insertUser(User user);
	boolean deleteUser(int id);
	boolean updateUser(User user);
	ResultVO login(String username,String password);
	ResultVO checkUser(String token); 
	ResultVO register(User user);
	ResultVO dataCheck(String param, int type);
}
