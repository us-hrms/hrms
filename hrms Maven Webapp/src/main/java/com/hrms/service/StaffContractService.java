package com.hrms.service;

import java.util.List;

import com.hrms.entity.StaffContract;

public interface StaffContractService {
       /**
        * ��ѯ����Ա����ͬ
        */
	   List<StaffContract>  getStaffContracts(StaffContract staffContract);
}
