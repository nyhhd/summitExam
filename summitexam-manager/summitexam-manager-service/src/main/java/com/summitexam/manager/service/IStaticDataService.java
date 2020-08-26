package com.summitexam.manager.service;

import java.util.List;

import com.summitexam.bean.StaticData;

public interface IStaticDataService {
	List<StaticData> getStaticDatas(String codeType);
	String getStaticData(String codeType,String codeValue);
}
