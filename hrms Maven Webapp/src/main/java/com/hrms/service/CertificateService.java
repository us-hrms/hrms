package com.hrms.service;

import java.io.Serializable;
import java.util.List;

import com.hrms.entity.Certificate;

public interface CertificateService {
	/**
	 * ����
	 * @param certificate
	 * @return
	 */
	boolean updateCertificate(Certificate certificate);
	
	/**
	 * ɾ��
	 * @param certificate
	 */
	boolean deleteCertificate(Certificate certificate);
	
	/**
	 * ����id���һ��Certificate����
	 */
	Certificate getCertificate(Serializable id);
	
	/**
	 * ������е�certificate����
	 * @return
	 */
	List<Certificate> getCertificates();
	
	/**
	 * ��������ѯcertificate
	 * @param certificate
	 * @return
	 */
	List<Certificate> getCertificates(Certificate certificate);
}
