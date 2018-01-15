package com.hrms.service.impl;

import java.util.List;

import com.hrms.dao.Dao;
import com.hrms.entity.Position;
import com.hrms.service.PositionService;

public class PositionServiceImpl implements PositionService {
    
	private Dao dao; 
	@Override
	public List<Position> getPositions(Position position) {
		// TODO Auto-generated method stub
		List<Position> list = dao.find(position);
		return list.size()>0 ? list : null;
	}
	
	public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
    
	
}
