package com.hrms.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.Department;
import com.hrms.entity.Position;
import com.hrms.entity.PunishmentReward;
import com.hrms.page.Page;
import com.hrms.scope.ServletScopeAware;
import com.hrms.service.DepartmentService;
import com.hrms.service.PositionService;
import com.hrms.service.PunishmentRewardService;
import com.hrms.util.MenuHelper;

@Controller
@Scope("prototype")
public class PunishmentRewardAction extends ServletScopeAware {
	@Autowired
	private PositionService positionService;
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private PunishmentRewardService punishmentRewardService;
    private String toJsp;
    private String toAction;
    private PunishmentReward puniReward;
    private String itemId;
    
    public String punishmentReward(){
    	List<Department> departments = departmentService.getDepartments();
        List<Position> positions = positionService.getPositions();
        List<PunishmentReward> punishmentRewardlist = punishmentRewardService.getPunishmentRewards();
        Page page = new Page();
    	page.setPageCountBySize(punishmentRewardlist.size());
    	List<PunishmentReward> punishmentRewardlists = punishmentRewardService.getPunishmentRewards(new PunishmentReward(), page);
        request.setAttribute("departments",departments);
        request.setAttribute("positions",positions);
        request.setAttribute("punishmentRewardlists",punishmentRewardlists);
        request.setAttribute("page",page);
		//设置菜单选项
		if(itemId != null)
			MenuHelper.changeMenu(session, itemId);
    	this.toJsp = "jsp/Wages/punishmentReward";
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
	public PunishmentReward getPuniReward() {
		return puniReward;
	}
	public void setPuniReward(PunishmentReward puniReward) {
		this.puniReward = puniReward;
	}

	public String getItemId() {
		return itemId;
	}


	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

    
    

}
