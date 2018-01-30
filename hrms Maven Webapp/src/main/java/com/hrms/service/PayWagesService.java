package com.hrms.service;

import java.io.Serializable;
import java.util.List;

import com.hrms.entity.PayWages;
import com.hrms.page.Page;

public interface PayWagesService {
	    /**
	     * 根据ID查询
	     */
		PayWages getPayWages(Serializable id);
	    /**
	     * 查询全部
	     */
		List<PayWages> getPayWagess();
		/**
		 * 根据条件查询
		 */
	   List<PayWages> getPayWagess(PayWages payWages);
	   /**
		 * 分页查询
		 */
	   List<PayWages> getPayWagess(PayWages payWages,Page page);
	   /**
	    * 更新
	    */
	   Boolean updatePayWages(PayWages payWages);
	   /**
	    * 删除
	    */
	   Boolean deletepayWages(PayWages payWages);
}
