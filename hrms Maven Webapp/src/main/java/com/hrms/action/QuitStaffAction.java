package com.hrms.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.QuitStaff;
import com.hrms.scope.ServletScopeAware;

@Controller
@Scope("prototype")
public class QuitStaffAction extends ServletScopeAware {
    private String toJsp;
    private String toAction;
    private QuitStaff quitStaff;
    
    public String quitStaff(){
    	
    	this.toJsp = "jsp/personnelManager/quitStaff";
    	return "tojsp";
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
	public QuitStaff getQuitStaff() {
		return quitStaff;
	}
	public void setQuitStaff(QuitStaff quitStaff) {
		this.quitStaff = quitStaff;
	}
    

}
