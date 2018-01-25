package com.hrms.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.StaffContract;
import com.hrms.scope.ServletScopeAware;

@Controller
@Scope("prototype")
public class StaffContractAction extends ServletScopeAware {
    private String toJsp;
    private String toAction;
    private StaffContract staffContract;
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
	public StaffContract getStaffContract() {
		return staffContract;
	}
	public void setStaffContract(StaffContract staffContract) {
		this.staffContract = staffContract;
	}
    

}
