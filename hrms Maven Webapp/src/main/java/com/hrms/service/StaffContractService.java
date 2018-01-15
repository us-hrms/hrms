package com.hrms.service;

import java.util.List;

import com.hrms.entity.StaffContract;

public interface StaffContractService {
       /**
        * 查询所有员工合同
        */
	   List<StaffContract>  getStaffContracts(StaffContract staffContract);
}
