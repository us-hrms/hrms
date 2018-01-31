package com.hrms.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.DataDictionary;
import com.hrms.entity.Department;
import com.hrms.entity.Position;
import com.hrms.entity.QuitStaff;
import com.hrms.page.Page;
import com.hrms.scope.ServletScopeAware;
import com.hrms.service.DataDictionaryService;
import com.hrms.service.DepartmentService;
import com.hrms.service.PositionService;
import com.hrms.service.QuitStaffService;
import com.hrms.util.MenuHelper;

@Controller
@Scope("prototype")
public class QuitStaffAction extends ServletScopeAware {
	
	@Autowired
	private QuitStaffService quitStaffService;
	@Autowired
	private DataDictionaryService dataDictionaryService;
	@Autowired
	private PositionService positionService;
	@Autowired
	private DepartmentService departmentService;
	
    private String toJsp;
    private String toAction;
    private QuitStaff quitStaff;
    private String itemId;
    
    public String quitStaff(){
    	DataDictionary dataDictionary = new DataDictionary();
		dataDictionary.setTableColumn("QUIT_TYPE");
		List<QuitStaff> quitStaffs = quitStaffService.getQuitStaffs();
		Page page = new Page();
        page.setPageCountBySize(quitStaffs.size());
        List<QuitStaff> quitStaffss = quitStaffService.getQuitStaffs(new QuitStaff(), page);
		List<DataDictionary> dataDictionarys = dataDictionaryService.getDataDictionarys(dataDictionary);
		List<Position> Position = positionService.getPositions();
		List<Department> department = departmentService.getDepartments();
		request.setAttribute("dataDictionarys", dataDictionarys);
		request.setAttribute("quitStaffs", quitStaffss);
		request.setAttribute("Position", Position);
		request.setAttribute("department", department);
		request.setAttribute("page", page);
		//设置菜单选项
		if(itemId != null)
			MenuHelper.changeMenu(session, itemId);
    	this.toJsp = "jsp/personnelManager/quitStaff";
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
	public QuitStaff getQuitStaff() {
		return quitStaff;
	}
	public void setQuitStaff(QuitStaff quitStaff) {
		this.quitStaff = quitStaff;
	}


	public String getItemId() {
		return itemId;
	}


	public void setItemId(String itemId) {
		this.itemId = itemId;
	}


}
