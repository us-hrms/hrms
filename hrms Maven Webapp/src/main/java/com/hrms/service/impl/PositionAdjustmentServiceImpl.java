package com.hrms.service.impl;

import java.util.List;

import com.hrms.dao.Dao;
import com.hrms.entity.PositionAdjustment;
import com.hrms.service.PositionAdjustmentService;

public class PositionAdjustmentServiceImpl implements PositionAdjustmentService {

	private Dao dao;
	@Override
	public List<PositionAdjustment> getPositionAdjustments(PositionAdjustment positionAdjustment) {
		// TODO Auto-generated method stub
		List<PositionAdjustment> list = dao.find(positionAdjustment);
		return list.size()>0?list : null;
	}
	
	public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}

	
	
}
