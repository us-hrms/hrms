package com.hrms.service;

import java.util.List;

import com.hrms.entity.DataDictionary;

public interface DataDictionaryService {
       /**
        * 根据条件查询
        */
	   List<DataDictionary> getDataDictionarys(DataDictionary dataDictionary);
}
