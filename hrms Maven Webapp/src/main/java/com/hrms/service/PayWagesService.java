package com.hrms.service;

import java.io.Serializable;
import java.util.List;

import com.hrms.entity.PayWages;

public interface PayWagesService {
	    /**
	     * ����ID��ѯ
	     */
		PayWages getPayWages(Serializable id);
	    /**
	     * ��ѯȫ��
	     */
		List<PayWages> getPayWagess();
		/**
		 * ����������ѯ
		 */
	   List<PayWages> getPayWagess(PayWages payWages);
	   /**
	    * ����
	    */
	   boolean updatePayWages(PayWages payWages);
	   /**
	    * ɾ��
	    */
	   boolean deletepayWages(PayWages payWages);
}
