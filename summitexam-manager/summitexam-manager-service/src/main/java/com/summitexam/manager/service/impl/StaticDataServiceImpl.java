package com.summitexam.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.summitexam.bean.StaticData;
import com.summitexam.bean.StaticDataExample;
import com.summitexam.bean.StaticDataExample.Criteria;
import com.summitexam.dao.StaticDataMapper;
import com.summitexam.manager.service.IStaticDataService;

@Service
public class StaticDataServiceImpl implements IStaticDataService{
	@Autowired
	private StaticDataExample staticDataExample;
	@Autowired
	private StaticDataMapper staticDataMapper;
	
	@Override
	public List<StaticData> getStaticDatas(String codeType) {
		// TODO Auto-generated method stub
		Criteria criteria = staticDataExample.createCriteria();
		criteria.andCodeTypeEqualTo(codeType);
		List<StaticData> staticDatas = staticDataMapper.selectByExample(staticDataExample);
		staticDataExample.clear();
		return staticDatas;
	}

	@Override
	public String getStaticData(String codeType, String codeValue) {
		// TODO Auto-generated method stub
		Criteria criteria = staticDataExample.createCriteria();
		criteria.andCodeTypeEqualTo(codeType);
		criteria.andCodeValueEqualTo(codeValue);
		List<StaticData> list = staticDataMapper.selectByExample(staticDataExample);
		staticDataExample.clear();
		if(list != null && 0 != list.size()) {
			return list.get(0).getCodeName();
		}else {
			return null;
		}
	}
	
}
