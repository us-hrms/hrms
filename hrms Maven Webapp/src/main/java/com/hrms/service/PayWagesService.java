package com.hrms.service;

import java.util.List;

import com.hrms.entity.PayWages;

public interface PayWagesService {
		/**
		 * 查询薪酬发放以及根据条件
		 */
	   List<PayWages> getPayWagess(PayWages payWages);
}
