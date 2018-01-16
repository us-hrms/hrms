package com.hrms.service.impl;

import java.util.List;

import com.hrms.dao.Dao;
import com.hrms.entity.PayWages;
import com.hrms.service.PayWagesService;

public class PayWagesServiceImpl implements PayWagesService {
    
	private Dao dao;
	@Override
	public List<PayWages> getPayWagess(PayWages payWages) {
		// TODO Auto-generated method stub
		return dao.find(payWages);
	}
	
	public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
}
