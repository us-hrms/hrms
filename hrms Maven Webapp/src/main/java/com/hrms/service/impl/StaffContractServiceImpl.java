package com.hrms.service.impl;

import java.util.List;

import com.hrms.dao.Dao;
import com.hrms.entity.StaffContract;
import com.hrms.service.StaffContractService;

public class StaffContractServiceImpl implements StaffContractService {
    
	private Dao dao;
	@Override
	public List<StaffContract> getStaffContracts(StaffContract staffContract) {
		// TODO Auto-generated method stub
		return dao.find(staffContract);
	}
	
	public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
}
