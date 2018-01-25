package com.hrms.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.PayWages;
import com.hrms.scope.ServletScopeAware;

@Controller
@Scope("prototype")
public class PayWagesAction extends ServletScopeAware {
	private PayWages payWages;
    private String toJsp;
    private String toAction;
	public PayWages getPayWages() {
		return payWages;
	}
	public void setPayWages(PayWages payWages) {
		this.payWages = payWages;
	}
	public String getToJsp() {
		return toJsp;
	}
	public void setToJsp(String toJsp) {
		this.toJsp = toJsp;
	}
	public String getToAction() {
		return toAction;
	}
	public void setToAction(String toAction) {
		this.toAction = toAction;
	}
    
    
}
