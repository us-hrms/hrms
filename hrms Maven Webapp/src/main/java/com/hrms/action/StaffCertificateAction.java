package com.hrms.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.StaffCertificate;
import com.hrms.scope.ServletScopeAware;

@Controller
@Scope("prototype")
public class StaffCertificateAction extends ServletScopeAware {
    private String toJsp;
    private String toAction;
    private StaffCertificate staffCertificate;
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
	public StaffCertificate getStaffCertificate() {
		return staffCertificate;
	}
	public void setStaffCertificate(StaffCertificate staffCertificate) {
		this.staffCertificate = staffCertificate;
	}

}
