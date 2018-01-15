package com.hrms.service.impl;

import java.util.List;

import com.hrms.dao.Dao;
import com.hrms.entity.Holiday;
import com.hrms.service.HolidayService;

public class HolidayServiceImpl implements HolidayService {
    
	private Dao dao; 
	
	@Override
	public List<Holiday> getHoliday(Holiday holiday) {
		// TODO Auto-generated method stub
		List<Holiday> list = dao.find(holiday);
		return list.size()>0 ? list : null;
	}

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
    
	
}
