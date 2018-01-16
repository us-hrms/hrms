package com.hrms.service.impl;

import java.util.List;

import com.hrms.dao.Dao;
import com.hrms.entity.CultivateRecord;
import com.hrms.service.CultivateRecordService;

public class CultivateRecordServiceImpl implements CultivateRecordService {
    
	private Dao dao;
	@Override
	public List<CultivateRecord> getCultivateRecords(
			CultivateRecord cultivateRecord) {
		// TODO Auto-generated method stub
		return dao.find(cultivateRecord);
	}
	
	public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
}
