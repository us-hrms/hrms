package com.hrms.service.impl;

import java.util.List;

import com.hrms.dao.Dao;
import com.hrms.entity.WagesStandard;
import com.hrms.service.WagesStandardService;

public class WagesStandardServiceImpl implements WagesStandardService {
    
	private Dao dao;
	@Override
	public List<WagesStandard> getWagesStandards(WagesStandard wagesStandard) {
		// TODO Auto-generated method stub
		return dao.find(wagesStandard);
	}
	
	public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
}
