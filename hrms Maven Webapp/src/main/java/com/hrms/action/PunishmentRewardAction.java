package com.hrms.action;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.PunishmentReward;
import com.hrms.scope.ServletScopeAware;

@Controller
@Scope("prototype")
public class PunishmentRewardAction extends ServletScopeAware {
    private String toJsp;
    private String toAction;
    private PunishmentReward puniReward;
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
	public PunishmentReward getPuniReward() {
		return puniReward;
	}
	public void setPuniReward(PunishmentReward puniReward) {
		this.puniReward = puniReward;
	}
    
    

}
