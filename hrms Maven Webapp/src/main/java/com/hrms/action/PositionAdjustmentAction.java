package com.hrms.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.Department;
import com.hrms.entity.PositionAdjustment;
import com.hrms.page.Page;
import com.hrms.scope.ServletScopeAware;
import com.hrms.service.DepartmentService;
import com.hrms.service.PositionAdjustmentService;
import com.hrms.util.MenuHelper;

@Controller
@Scope("prototype")
public class PositionAdjustmentAction extends ServletScopeAware {
	
	@Autowired
	private PositionAdjustmentService positionAdjustmentService;
	@Autowired
	private DepartmentService departmentService;
    private String toJsp;
    private String toAction;
    private PositionAdjustment posiAdju;
    private String itemId;
    
    public String posiAdju(){
    	List<Department> departments = departmentService.getDepartments();
    	List<PositionAdjustment> positionAdjustments = positionAdjustmentService.getPositionAdjustment();
    	Page page = new Page();
        page.setPageCountBySize(positionAdjustments.size());
        List<PositionAdjustment> positionAdjustmentss = positionAdjustmentService.getPositionAdjustment(new PositionAdjustment(), page);
    	request.setAttribute("departments",departments);
        request.setAttribute("positionAdjustments",positionAdjustmentss);
		//设置菜单选项
		if(itemId != null)
			MenuHelper.changeMenu(session, itemId);
    	toJsp = "jsp/personnelManager/posiAdju";
    	return "tojsp";
    }
    
    public String posiAdjuInfo(){

		//设置菜单选项
		if(itemId != null)
			MenuHelper.changeMenu(session, itemId);
    	toJsp = "jsp/personnelManager/posiAdjuInfo";
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
	public PositionAdjustment getPosiAdju() {
		return posiAdju;
	}
	public void setPosiAdju(PositionAdjustment posiAdju) {
		this.posiAdju = posiAdju;
	}

	public String getItemId() {
		return itemId;
	}


	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

    
    

}
