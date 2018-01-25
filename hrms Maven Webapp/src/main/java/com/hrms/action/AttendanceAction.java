package com.hrms.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.Attendance;
import com.hrms.scope.ServletScopeAware;

@Controller
@Scope("prototype")
public class AttendanceAction extends ServletScopeAware {
	private Attendance attendance;
    private String toJsp;
    private String toAction;

	public String attendance(){
		
		toJsp = "jsp/personnelManager/attendance";
		return "tojsp";
	}
	
	
	public Attendance getAttendance() {
		return attendance;
	}

	public void setAttendance(Attendance attendance) {
		this.attendance = attendance;
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
