package com.hrms.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.Cultivate;
import com.hrms.scope.ServletScopeAware;

@Controller
@Scope("prototype")
public class CultivateAction extends ServletScopeAware {
	private Cultivate cultivate;
    private String toJsp;
    private String toAction;
    
    
	public Cultivate getCultivate() {
		return cultivate;
	}
	public void setCultivate(Cultivate cultivate) {
		this.cultivate = cultivate;
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
