package com.hrms.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.Certificate;
import com.hrms.scope.ServletScopeAware;

@Controller
@Scope("prototype")
public class CertificateAction extends ServletScopeAware {
    private String toJsp;
    private String toAction;
    private Certificate certificate;
    
    
    
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
	public Certificate getCertificate() {
		return certificate;
	}
	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}
    
    

}
