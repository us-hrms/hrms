package com.hrms.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.Holiday;
import com.hrms.scope.ServletScopeAware;

@Controller
@Scope("prototype")
public class HolidayAction extends ServletScopeAware {
    private String toJsp;
    private String toAction;
    private Holiday holiday;
    
    public String holiday(){
    	
    	toJsp = "jsp/personnelManager/holiday";
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
	public Holiday getHoliday() {
		return holiday;
	}
	public void setHoliday(Holiday holiday) {
		this.holiday = holiday;
	}
    
    

}
