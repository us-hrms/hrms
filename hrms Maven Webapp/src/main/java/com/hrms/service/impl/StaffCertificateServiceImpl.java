package com.hrms.service.impl;

import java.util.List;

import com.hrms.dao.Dao;
import com.hrms.entity.StaffCertificate;
import com.hrms.service.StaffCertificateService;


public class StaffCertificateServiceImpl implements StaffCertificateService {
    
	private Dao dao;
	@Override
	public List<StaffCertificate> getStaffCertificates(StaffCertificate staffCertificate) {
		// TODO Auto-generated method stub
		return dao.find(staffCertificate);
	}
	
	public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
    
}
