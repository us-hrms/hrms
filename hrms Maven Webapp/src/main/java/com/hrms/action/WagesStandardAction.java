package com.hrms.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.WagesStandard;
import com.hrms.scope.ServletScopeAware;

@Controller
@Scope("prototype")
public class WagesStandardAction extends ServletScopeAware {
    private String toJsp;
    private String toAction;
    private WagesStandard wagesStandard;
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
	public WagesStandard getWagesStandard() {
		return wagesStandard;
	}
	public void setWagesStandard(WagesStandard wagesStandard) {
		this.wagesStandard = wagesStandard;
	}
    

}
