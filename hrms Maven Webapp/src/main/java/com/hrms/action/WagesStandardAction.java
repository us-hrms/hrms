package com.hrms.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.Department;
import com.hrms.entity.Position;
import com.hrms.entity.Staff;
import com.hrms.entity.WagesStandard;
import com.hrms.page.Page;
import com.hrms.scope.ServletScopeAware;
import com.hrms.service.DepartmentService;
import com.hrms.service.PositionService;
import com.hrms.service.StaffService;
import com.hrms.util.MenuHelper;

@Controller
@Scope("prototype")
public class WagesStandardAction extends ServletScopeAware {
	@Autowired
	private StaffService staffService;
	@Autowired
	private PositionService positionService;
	@Autowired
	private DepartmentService departmentService;
    private String toJsp;
    private String toAction;
    private WagesStandard wagesStandard;
    private String itemId;
    
    public String wagesStandard(){
    	List<Staff> stafflist = staffService.getStaffs();
    	Page page = new Page();
    	page.setPageCountBySize(stafflist.size());
    	List<Staff> stafflists = staffService.getStaffs(new Staff(), page);
    	List<Department> departments = departmentService.getDepartments();
        List<Position> positions = positionService.getPositions();
        request.setAttribute("departments",departments);
        request.setAttribute("positions",positions);
        request.setAttribute("stafflists",stafflists);
        request.setAttribute("page",page);
		//设置菜单选项
		if(itemId != null)
			MenuHelper.changeMenu(session, itemId);
    	this.toJsp = "jsp/Wages/wagesStandard";
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
	public WagesStandard getWagesStandard() {
		return wagesStandard;
	}
	public void setWagesStandard(WagesStandard wagesStandard) {
		this.wagesStandard = wagesStandard;
	}

	public String getItemId() {
		return itemId;
	}


	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

    

}
