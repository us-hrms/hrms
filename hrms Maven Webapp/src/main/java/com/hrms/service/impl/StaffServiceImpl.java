package com.hrms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.dao.Dao;
import com.hrms.entity.Staff;
import com.hrms.service.StaffService;

@Service
public class StaffServiceImpl implements StaffService {
    
	@Autowired
	private Dao dao;
	@Override
	public boolean login(Staff staff) {
		// TODO Auto-generated method stub
		String hql = "from Staff where no =: no and password =: password";
		List<Staff> list = dao.find(hql, staff);
		if(list.size()>0){
			return true;
		}
		return false;
	}

	@Override
	public List<Staff> getStaffs() {
		// TODO Auto-generated method stub
		String hql = "from Staff";
		List<Staff> list  = dao.find(hql);
		return list.size()>0?list:null;
	}

	@Override
	public List<Staff> getStaffs(Staff staff) {
		// TODO Auto-generated method stub
		List<Staff> list = dao.find(staff);
		return list.size()>0?list:null;
	}
}
