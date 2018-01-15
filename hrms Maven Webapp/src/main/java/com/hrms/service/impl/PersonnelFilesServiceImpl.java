package com.hrms.service.impl;

import java.util.List;

import com.hrms.dao.Dao;
import com.hrms.entity.PersonnelFiles;
import com.hrms.service.PersonnelFilesService;

public class PersonnelFilesServiceImpl implements PersonnelFilesService {
    
	private Dao dao;
	@Override
	public List<PersonnelFiles> getPersonnelFiless(PersonnelFiles personnelFiles) {
		// TODO Auto-generated method stub
		List<PersonnelFiles> list = dao.find(personnelFiles);
		return list.size()>0?list:null;
	}
	
	public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
   
	
}
