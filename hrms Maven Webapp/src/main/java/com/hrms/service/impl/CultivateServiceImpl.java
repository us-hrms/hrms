package com.hrms.service.impl;

import java.util.List;

import com.hrms.dao.Dao;
import com.hrms.entity.Cultivate;
import com.hrms.service.CultivateService;

public class CultivateServiceImpl implements CultivateService {
    
	private Dao dao;
	@Override
	public List<Cultivate> getCultivates(Cultivate cultivate) {
		// TODO Auto-generated method stub
		return dao.find(cultivate);
	}
	
	public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
}
