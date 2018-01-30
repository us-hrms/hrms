package com.hrms.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.Department;
import com.hrms.entity.PayWages;
import com.hrms.entity.Position;
import com.hrms.page.Page;
import com.hrms.scope.ServletScopeAware;
import com.hrms.service.DepartmentService;
import com.hrms.service.PayWagesService;
import com.hrms.service.PositionService;
import com.hrms.util.MenuHelper;

@Controller
@Scope("prototype")
public class PayWagesAction extends ServletScopeAware {
	@Autowired
	private PayWagesService payWagesService;
	@Autowired
	private PositionService positionService;
	@Autowired
	private DepartmentService departmentService;
	private PayWages payWages;
    private String toJsp;
    private String toAction;
    private String itemId;
    
    public String payWages(){
    	List<Department> departments = departmentService.getDepartments();
        List<Position> positions = positionService.getPositions();
        List<PayWages> payWageslist = payWagesService.getPayWagess();
        Page page = new Page();
        page.setPageCountBySize(payWageslist.size());
        List<PayWages> payWageslists = payWagesService.getPayWagess(new PayWages(), page);
        request.setAttribute("departments",departments);
        request.setAttribute("positions",positions);
        request.setAttribute("payWageslists",payWageslists);
        request.setAttribute("page",page);
		//设置菜单选项
		if(itemId != null)
			MenuHelper.changeMenu(session, itemId);
    	this.toJsp = "jsp/Wages/payWages";
    	return "tojsp";
    }
    
	public PayWages getPayWages() {
		return payWages;
	}
	public void setPayWages(PayWages payWages) {
		this.payWages = payWages;
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

	public String getItemId() {
		return itemId;
	}


	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

    
    
}
