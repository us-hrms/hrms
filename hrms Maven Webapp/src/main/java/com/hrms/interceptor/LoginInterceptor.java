package com.hrms.interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class LoginInterceptor extends AbstractInterceptor {

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		if(invocation.getInvocationContext().getSession().containsKey("currStaff"))
			return invocation.invoke();
		else
			return "home";
	}

}
