package com.hrms.service;

import java.util.List;

import com.hrms.entity.WagesStandard;

public interface WagesStandardService {
       /**
        * 薪酬查询以及按条件查询
        */
	    List<WagesStandard> getWagesStandards(WagesStandard wagesStandard);
}
