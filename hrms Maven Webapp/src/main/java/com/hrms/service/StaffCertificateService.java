package com.hrms.service;

import java.util.List;

import com.hrms.entity.StaffCertificate;

public interface StaffCertificateService {
        /**
         * ��ѯԱ��֤���¼
         */
	    List<StaffCertificate> getStaffCertificates(StaffCertificate staffCertificate);
}
