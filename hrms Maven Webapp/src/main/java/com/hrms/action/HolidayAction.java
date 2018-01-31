package com.hrms.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.Department;
import com.hrms.entity.Holiday;
import com.hrms.entity.Position;
import com.hrms.page.Page;
import com.hrms.scope.ServletScopeAware;
import com.hrms.service.DepartmentService;
import com.hrms.service.HolidayService;
import com.hrms.service.PositionService;
import com.hrms.util.MenuHelper;

@Controller
@Scope("prototype")
public class HolidayAction extends ServletScopeAware {
	
	@Autowired
	private HolidayService holidayService;
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private PositionService positionService;
    private String toJsp;
    private String toAction;
    private Holiday holiday;
    private String itemId;
    
    public String holiday(){
         List<Holiday> holidays = holidayService.getHolidays();
         Page page = new Page();
         page.setPageCountBySize(holidays.size());
         List<Holiday> holidayss = holidayService.getHolidays(new Holiday(), page);
         List<Department> departments = departmentService.getDepartments();
         List<Position> positions = positionService.getPositions();
         request.setAttribute("holidays",holidayss);
         request.setAttribute("departments",departments);
         request.setAttribute("positions",positions);
         request.setAttribute("page",page);
		//设置菜单选项
		if(itemId != null)
			MenuHelper.changeMenu(session, itemId);
    	toJsp = "jsp/personnelManager/holiday";
    	return "tojsp";
    }
    /**
     * 根据条件查
     * @return
     */
    public String condition(){
    	List<Holiday> holidays = holidayService.getHolidays(holiday);
        Page page = new Page();
        page.setPageCountBySize(holidays.size());
        List<Holiday> holidayss = holidayService.getHolidays(holiday, page);
        List<Department> departments = departmentService.getDepartments();
        List<Position> positions = positionService.getPositions();
        request.setAttribute("holidays",holidayss);
        request.setAttribute("departments",departments);
        request.setAttribute("positions",positions);
        request.setAttribute("page",page);
    	toJsp = "jsp/personnelManager/holiday";
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
	public Holiday getHoliday() {
		return holiday;
	}
	public void setHoliday(Holiday holiday) {
		this.holiday = holiday;
	}


	public String getItemId() {
		return itemId;
	}


	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public HolidayService getHolidayService() {
		return holidayService;
	}

	public void setHolidayService(HolidayService holidayService) {
		this.holidayService = holidayService;
	}

	public DepartmentService getDepartmentService() {
		return departmentService;
	}

	public void setDepartmentService(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	public PositionService getPositionService() {
		return positionService;
	}

	public void setPositionService(PositionService positionService) {
		this.positionService = positionService;
	}

    

}
