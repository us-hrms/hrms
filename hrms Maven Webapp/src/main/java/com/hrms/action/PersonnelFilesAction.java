package com.hrms.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.DataDictionary;
import com.hrms.entity.Department;
import com.hrms.entity.PersonnelFiles;
import com.hrms.entity.Position;
import com.hrms.page.Page;
import com.hrms.scope.ServletScopeAware;
import com.hrms.service.DataDictionaryService;
import com.hrms.service.DepartmentService;
import com.hrms.service.PersonnelFilesService;
import com.hrms.service.PositionService;
import com.hrms.util.MenuHelper;

@Controller
@Scope("prototype")
public class PersonnelFilesAction extends ServletScopeAware {
	@Autowired
	private PersonnelFilesService personnelFilesService;
	@Autowired
	private PositionService positionService;
	@Autowired
	private DataDictionaryService dataDictionaryService;
	@Autowired
	private DepartmentService departmentService;
    private String toJsp;
    private String toAction;
    private PersonnelFiles personnelFiles;
    private String itemId;

    public String staffFile(){
    	DataDictionary dataDictionary = new DataDictionary();
		dataDictionary.setTableColumn("STAFF_STATUS");
		List<DataDictionary> Dictionarylist = dataDictionaryService.getDataDictionarys(dataDictionary);
    	List<PersonnelFiles> personnelFiless = personnelFilesService.getPersonnelFiles();
    	Page page = new Page();
        page.setPageCountBySize(personnelFiless.size());
        List<PersonnelFiles> personnelFilesss = personnelFilesService.getPersonnelFiless(new PersonnelFiles(), page);
    	List<Position> positions = positionService.getPositions();
    	List<Department> departments = departmentService.getDepartments();
    	request.setAttribute("Dictionarylist", Dictionarylist);
    	request.setAttribute("personnelFiless", personnelFilesss);
    	request.setAttribute("positions", positions);
    	request.setAttribute("departments", departments);
    	request.setAttribute("page", page);
		//设置菜单选项 
		if(itemId != null)
			MenuHelper.changeMenu(session, itemId);
    	this.toJsp = "jsp/staffInfoManager/staffFile";
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
	public PersonnelFiles getPersonnelFiles() {
		return personnelFiles;
	}
	public void setPersonnelFiles(PersonnelFiles personnelFiles) {
		this.personnelFiles = personnelFiles;
	}

	public String getItemId() {
		return itemId;
	}


	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

    

}
