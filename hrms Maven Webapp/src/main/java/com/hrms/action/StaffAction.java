package com.hrms.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.alibaba.fastjson.JSONObject;
import com.hrms.entity.Staff;
import com.hrms.scope.ServletScopeAware;
import com.hrms.service.StaffService;
import com.hrms.util.PrintWriteUtil;
import com.hrms.xml.entity.Menu;

@Controller
@Scope("prototype")
public class StaffAction extends ServletScopeAware {

   @Autowired
   private StaffService staffService;
   private Staff staff;
   private String toJsp;
   private String toAction;
   
   /**
    * È¥µÇÂ¼Ò³Ãæ
    * @return
    */
   public String toLogin(){
	   toJsp = "login";
	   return "toLoginSuccess";
   }
   
   /**
    * µÇÂ¼
    * @return
    */
   public String loginAjax(){
	   staff = staffService.login(staff);
	   if(staff != null){
		   session.setAttribute("currStaff", staff);
		   Map<Integer, Menu> menu = (Map<Integer, Menu>)application.getAttribute("roleMenuMap");
		   Long id = staff.getDataDictionaryByTypeId().getId();
		   session.setAttribute("currMenu", menu.get(id.intValue()));
	   }
	   PrintWriteUtil.write(response, staff!=null?"true":"false");
	   return null;
   }
	
	public StaffService getStaffService() {
		return staffService;
	}
	
	public void setStaffService(StaffService staffService) {
		this.staffService = staffService;
	}
	
	public Staff getStaff() {
		return staff;
	}
	
	public void setStaff(Staff staff) {
		this.staff = staff;
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
   
}
