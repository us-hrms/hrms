package com.hrms.service.impl;

import java.util.List;

import com.hrms.dao.Dao;
import com.hrms.entity.Department;
import com.hrms.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {
    
	private Dao dao;
	@Override
	public List<Department> getDepartments(Department department) {
		// TODO Auto-generated method stub
		List<Department> list = dao.find(department);
		return list.size()>0 ? list: null ;
	}
	public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
}
