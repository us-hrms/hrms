package com.hrms.service;

import java.util.List;

import com.hrms.entity.DataDictionary;

public interface DataDictionaryService {
       /**
        * ����������ѯ
        */
	   List<DataDictionary> getDataDictionarys(DataDictionary dataDictionary);
}
