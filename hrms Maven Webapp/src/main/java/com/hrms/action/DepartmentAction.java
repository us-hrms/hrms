package com.hrms.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.Department;
import com.hrms.scope.ServletScopeAware;

@Controller
@Scope("prototype")
public class DepartmentAction extends ServletScopeAware {
	private Department department;
    private String toJsp;
    private String toAction;
    
    public String department(){
    	
    	toJsp = "jsp/personnelManager/department";
    	return "tojsp";
    }
    
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
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
