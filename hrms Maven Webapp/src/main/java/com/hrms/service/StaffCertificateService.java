package com.hrms.service;

import java.util.List;

import com.hrms.entity.StaffCertificate;

public interface StaffCertificateService {
        /**
         * 查询员工证书记录
         */
	    List<StaffCertificate> getStaffCertificates(StaffCertificate staffCertificate);
}
