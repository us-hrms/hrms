package com.hrms.service;

import java.util.List;

import com.hrms.entity.WagesStandard;

public interface WagesStandardService {
       /**
        * н���ѯ�Լ���������ѯ
        */
	    List<WagesStandard> getWagesStandards(WagesStandard wagesStandard);
}
