package com.hrms.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.DataDictionary;
import com.hrms.entity.Department;
import com.hrms.entity.Position;
import com.hrms.entity.StaffContract;
import com.hrms.page.Page;
import com.hrms.scope.ServletScopeAware;
import com.hrms.service.DataDictionaryService;
import com.hrms.service.DepartmentService;
import com.hrms.service.PositionService;
import com.hrms.service.StaffContractService;
import com.hrms.util.MenuHelper;

@Controller
@Scope("prototype")
public class StaffContractAction extends ServletScopeAware {
	@Autowired
	private StaffContractService staffContractService;
	@Autowired
	private PositionService positionService;
	@Autowired
	private DataDictionaryService dataDictionaryService;
	@Autowired
	private DepartmentService departmentService;
    private String toJsp;
    private String toAction;
    private StaffContract staffContract;
    private String itemId;

    public String staffContract(){
    	DataDictionary dataDictionary = new DataDictionary();
		dataDictionary.setTableColumn("STAFF_STATUS");
		List<DataDictionary> Dictionarylist = dataDictionaryService.getDataDictionarys(dataDictionary);
		List<Position> positions = positionService.getPositions();
    	List<Department> departments = departmentService.getDepartments();
    	List<StaffContract> staffContracts=staffContractService.getStaffContracts();
    	Page page = new Page();
        page.setPageCountBySize(staffContracts.size());
        List<StaffContract> staffContractss=staffContractService.getStaffContracts(new StaffContract(), page);
    	request.setAttribute("positions", positions);
    	request.setAttribute("departments", departments);
    	request.setAttribute("Dictionarylist", Dictionarylist);
    	request.setAttribute("staffContracts", staffContractss);
		//设置菜单选项
		if(itemId != null)
			MenuHelper.changeMenu(session, itemId);
    	this.toJsp = "jsp/staffInfoManager/staffContract";
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
	public StaffContract getStaffContract() {
		return staffContract;
	}
	public void setStaffContract(StaffContract staffContract) {
		this.staffContract = staffContract;
	}

	public String getItemId() {
		return itemId;
	}


	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

    

}
