package com.hrms.action;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.Staff;
import com.hrms.scope.ServletScopeAware;
import com.hrms.service.StaffService;
import com.hrms.util.PrintWriteUtil;
import com.hrms.xml.entity.Menu;
import com.hrms.xml.entity.Nav;
import com.hrms.xml.entity.Navbar;

@Controller
@Scope("prototype")
public class StaffAction extends ServletScopeAware {

   @Autowired
   private StaffService staffService;
   private Staff staff;
   private String toJsp;
   private String toAction;
   
   /**
    * ȥ��¼ҳ��
    * @return
    */
   public String toLogin(){
	   toJsp = "login";
	   return "toLoginSuccess";
   }
   
   /**
    * ��¼
    * @return
    */
   public String loginAjax(){
	   staff = staffService.login(staff);
	   if(staff != null){
		   session.setAttribute("currStaff", staff);
		   Long id = staff.getDataDictionaryByTypeId().getId();
		   //��application�ó�����
		   //�ó����еĽ�ɫ�˵�
		   Map<Integer, Menu> menu = (Map<Integer, Menu>)application.getAttribute("roleMenuMap");
		   Navbar navbar = (Navbar)application.getAttribute("navbar");
		   //���뵱ǰstaff��ӦȨ�޵ĵĲ˵���
		   session.setAttribute("currMenu", menu.get(id.intValue()));
		   //���뵱ǰstaff��Ӧ�ĵ����˵���
		   session.setAttribute("currNavbar", navbar.getCommonAndCustomizeNavsClone(id));
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
