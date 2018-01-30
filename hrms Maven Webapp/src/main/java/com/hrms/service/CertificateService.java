package com.hrms.service;

import java.io.Serializable;
import java.util.List;

import com.hrms.entity.Certificate;
import com.hrms.page.Page;

public interface CertificateService {
	/**
	 * ����
	 * @param certificate
	 * @return
	 */
	Boolean updateCertificate(Certificate certificate);
	
	/**
	 * ɾ��
	 * @param certificate
	 */
	Boolean deleteCertificate(Certificate certificate);
	
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
	/**
	 * ��ҳ��ѯ
	 * @param certificate
	 * @return
	 */
	List<Certificate> getCertificates(Certificate certificate,Page page);
}
