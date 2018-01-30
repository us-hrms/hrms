package com.hrms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.dao.Dao;
import com.hrms.entity.DataDictionary;
import com.hrms.service.DataDictionaryService;

@Service
public class DataDictionaryServiceImpl implements DataDictionaryService {

	@Autowired
	private Dao dao;
	
	@Override
	public List<DataDictionary> getDataDictionarys(DataDictionary dataDictionary) {
		// TODO Auto-generated method stub
		List<DataDictionary> list = dao.find(dataDictionary);
		return list.size()>0 ? list:null;
	}

}
