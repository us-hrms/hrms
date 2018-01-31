package com.hrms.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.Certificate;
import com.hrms.entity.Department;
import com.hrms.entity.Position;
import com.hrms.entity.StaffCertificate;
import com.hrms.page.Page;
import com.hrms.scope.ServletScopeAware;
import com.hrms.service.CertificateService;
import com.hrms.service.DepartmentService;
import com.hrms.service.PositionService;
import com.hrms.service.StaffCertificateService;
import com.hrms.util.MenuHelper;

@Controller
@Scope("prototype")
public class StaffCertificateAction extends ServletScopeAware {
	@Autowired
	private StaffCertificateService staffCertificateService;
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private PositionService positionService;
	@Autowired
	private CertificateService certificateService;
    private String toJsp;
    private String toAction;
    private StaffCertificate staffCertificate;
    private String itemId;
    
    
    public String staffCertificateManager(){
    	List<Position> positions = positionService.getPositions();
    	List<Department> departments = departmentService.getDepartments();
    	List<Certificate> certificates = certificateService.getCertificates();
    	List<StaffCertificate> staffCertificates=staffCertificateService.getStaffCertificates();
    	Page page = new Page();
        page.setPageCountBySize(staffCertificates.size());
        List<StaffCertificate> staffCertificatess=staffCertificateService.getStaffCertificates(new StaffCertificate(), page);
    	for (StaffCertificate staffCertificate : staffCertificatess) {
    		if(staffCertificate.getCultivateStaff().getId()!=null){
    			staffCertificate.setWhether("Yes");
    		}else{
    		staffCertificate.setWhether("No");}
		}
    	request.setAttribute("positions", positions);
    	request.setAttribute("departments", departments);
    	request.setAttribute("certificates", certificates);
    	request.setAttribute("staffCertificates", staffCertificatess);
    	request.setAttribute("page", page);
		//设置菜单选项
		if(itemId != null)
			MenuHelper.changeMenu(session, itemId);
    	this.toJsp = "jsp/staffInfoManager/staffCertificateManager";
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
	public StaffCertificate getStaffCertificate() {
		return staffCertificate;
	}
	public void setStaffCertificate(StaffCertificate staffCertificate) {
		this.staffCertificate = staffCertificate;
	}

	public String getItemId() {
		return itemId;
	}


	public void setItemId(String itemId) {
		this.itemId = itemId;
	}


}
