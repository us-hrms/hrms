package com.hrms.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.Attendance;
import com.hrms.entity.DataDictionary;
import com.hrms.entity.Staff;
import com.hrms.page.Page;
import com.hrms.scope.ServletScopeAware;
import com.hrms.service.AttendanceService;
import com.hrms.service.DataDictionaryService;
import com.hrms.service.StaffService;
import com.hrms.util.MenuHelper;
import com.hrms.util.NavbarHelper;

@Controller
@Scope("prototype")
public class AttendanceAction extends ServletScopeAware {
	
	@Autowired
	private AttendanceService atteService;
	@Autowired
	private DataDictionaryService dataDictionaryService;
	@Autowired
	private StaffService staffService;
	private Attendance attendance;
    private String toJsp;
    private String toAction;
    private String itemId;
    private Long navId;

	public String attendance(){
		Staff currStaff = (Staff) session.getAttribute("currStaff"),staff = new Staff();
		Attendance temp = new Attendance();
		staff.setId(currStaff.getId());
		temp.setStaff(staff);
		DataDictionary dataDictionary = new DataDictionary();
		dataDictionary.setTableColumn("ATTENDANCE_TYPE");
		List<Attendance> attes = atteService.getAttendances(temp);
		Page page = new Page();
		page.setPageCountBySize(attes.size());
		List<Attendance> atteslist =atteService.getAttendances(temp, page);
		List<DataDictionary> Dictionarylist = dataDictionaryService.getDataDictionarys(dataDictionary);
		request.setAttribute("Dictionarylist", Dictionarylist);
		request.setAttribute("atteList", atteslist);
		request.setAttribute("page", page);
		//设置nvabar
		if(navId != null)
			NavbarHelper.changeNavbar(session, navId);
		//设置菜单选项
		if(itemId != null)
			MenuHelper.changeMenu(session, itemId);
		toJsp = "jsp/personnelManager/attendance";
		return "tojsp";
	}
	/**
	 * 根据条件查
	 * @return
	 */
	public String condition(String name){
		
		toJsp = "jsp/personnelManager/attendance";
		return "tojsp";
	}
	//FROM `data_dictionary` WHERE TableColumn='ATTENDANCE_TYPE'
	public Attendance getAttendance() {
		return attendance;
	}

	public void setAttendance(Attendance attendance) {
		this.attendance = attendance;
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


	public Long getNavId() {
		return navId;
	}


	public void setNavId(Long navId) {
		this.navId = navId;
	}


	public AttendanceService getAtteService() {
		return atteService;
	}


	public void setAtteService(AttendanceService atteService) {
		this.atteService = atteService;
	}
	public DataDictionaryService getDataDictionaryService() {
		return dataDictionaryService;
	}
	public void setDataDictionaryService(DataDictionaryService dataDictionaryService) {
		this.dataDictionaryService = dataDictionaryService;
	}
	
}
