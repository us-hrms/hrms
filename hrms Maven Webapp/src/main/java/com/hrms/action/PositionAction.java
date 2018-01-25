package com.hrms.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.Position;
import com.hrms.scope.ServletScopeAware;

@Controller
@Scope("prototype")
public class PositionAction extends ServletScopeAware {
    private String toJsp;
    private String toAction;
    private Position position;
    
    public String position(){
    	
    	toJsp = "jsp/personnelManager/position";
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
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
    

}
