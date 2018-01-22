package com.hrms.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.hrms.entity.Staff;
import com.hrms.service.StaffService;

@Controller
public class StaffAction {

   @Autowired
   private StaffService ssi;
   
   public String login(Staff staff){
	   
	   return null;
   }

	public StaffService getSsi() {
		return ssi;
	}
	
	public void setSsi(StaffService ssi) {
		this.ssi = ssi;
	} 
   
   
}
