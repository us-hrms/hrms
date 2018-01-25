package com.hrms.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.PersonnelFiles;
import com.hrms.scope.ServletScopeAware;

@Controller
@Scope("prototype")
public class PersonnelFilesAction extends ServletScopeAware {
    private String toJsp;
    private String toAction;
    private PersonnelFiles personnelFiles;
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
	public PersonnelFiles getPersonnelFiles() {
		return personnelFiles;
	}
	public void setPersonnelFiles(PersonnelFiles personnelFiles) {
		this.personnelFiles = personnelFiles;
	}
    

}
