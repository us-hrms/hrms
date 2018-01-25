package com.hrms.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.CultivateRecord;
import com.hrms.scope.ServletScopeAware;

@Controller
@Scope("prototype")
public class CultivateRecordAction extends ServletScopeAware {
	private CultivateRecord cultivateRecord;
    private String toJsp;
    private String toAction;
	public CultivateRecord getCultivateRecord() {
		return cultivateRecord;
	}
	public void setCultivateRecord(CultivateRecord cultivateRecord) {
		this.cultivateRecord = cultivateRecord;
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
