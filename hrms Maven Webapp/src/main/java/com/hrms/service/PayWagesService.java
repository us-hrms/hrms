package com.hrms.service;

import java.io.Serializable;
import java.util.List;

import com.hrms.entity.PayWages;
import com.hrms.page.Page;

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
		 * ��ҳ��ѯ
		 */
	   List<PayWages> getPayWagess(PayWages payWages,Page page);
	   /**
	    * ����
	    */
	   Boolean updatePayWages(PayWages payWages);
	   /**
	    * ɾ��
	    */
	   Boolean deletepayWages(PayWages payWages);
}
