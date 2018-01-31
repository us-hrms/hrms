package com.hrms.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.Department;
import com.hrms.entity.Staff;
import com.hrms.page.Page;
import com.hrms.scope.ServletScopeAware;
import com.hrms.service.DepartmentService;
import com.hrms.util.MenuHelper;

@Controller
@Scope("prototype")
public class DepartmentAction extends ServletScopeAware {
	@Autowired
	private DepartmentService departmentService;
	private Department department;
    private String toJsp;
    private String toAction;
    private String itemId;
    
    public String department(){
    	List<Department> departments = departmentService.getDepartments();
    	Page page = new Page();
    	page.setPageCountBySize(departments.size());
    	List<Department> departmentss = departmentService.getDepartments(new Department(), page);
    	request.setAttribute("departments", departmentss);
    	request.setAttribute("page", page);
		//设置菜单选项
		if(itemId != null)
			MenuHelper.changeMenu(session, itemId);
    	toJsp = "jsp/personnelManager/department";
    	return "tojsp";
    }
    /**
     * 按条件查询
     * @param departments
     * @return
     */
    public String department2(){
    	List<Department> departments = departmentService.getDepartments(department);
    	Page page = new Page();
    	page.setPageCountBySize(departments.size());
    	List<Department> departmentss = departmentService.getDepartments(department, page);
    	request.setAttribute("departments", departmentss);
    	request.setAttribute("page", page);
    	toJsp = "jsp/personnelManager/department";
    	return "tojsp";
    }
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
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

	public DepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

    

}
