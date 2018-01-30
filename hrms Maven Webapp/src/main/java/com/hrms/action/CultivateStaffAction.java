package com.hrms.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.Certificate;
import com.hrms.entity.CultivateStaff;
import com.hrms.entity.DataDictionary;
import com.hrms.page.Page;
import com.hrms.scope.ServletScopeAware;
import com.hrms.service.CertificateService;
import com.hrms.service.CultivateStaffService;
import com.hrms.service.DataDictionaryService;
import com.hrms.util.MenuHelper;

@Controller
@Scope("prototype")
public class CultivateStaffAction extends ServletScopeAware {
	@Autowired
	private DataDictionaryService dataDictionaryService;
	@Autowired
	private CultivateStaffService cultivateStaffService;
	@Autowired
	private CertificateService certificateService;
	
	private CultivateStaff cultivateStaff;
    private String toJsp;
    private String toAction;
    private String itemId;
    
    public String cultivateStaff(){
    	DataDictionary dataDictionary =new DataDictionary();
    	dataDictionary.setTableColumn("CULTIVATESTAFF_PAYTYPE");//培训类型
        List<DataDictionary> dataDictionarylists = dataDictionaryService.getDataDictionarys(dataDictionary);
        List<Certificate> certificatelist = certificateService.getCertificates();
        List<CultivateStaff>  CultivateStafflist =cultivateStaffService.getCultivateStaffs();
        Page page = new Page();
        page.setPageCountBySize(CultivateStafflist.size());
        List<CultivateStaff>  CultivateStafflists =cultivateStaffService.getCultivateStaffs(new CultivateStaff(), page);
        request.setAttribute("page", page);
        request.setAttribute("dataDictionarylists", dataDictionarylists);
        request.setAttribute("certificatelist", certificatelist);
        request.setAttribute("CultivateStafflists", CultivateStafflists);
        //设置菜单选项
		if(itemId != null)
			MenuHelper.changeMenu(session, itemId);
    	this.toJsp = "jsp/cultivatePlan/cultivateStaff";
    	return "tojsp";
    }
    
	public CultivateStaff getCultivateStaff() {
		return cultivateStaff;
	}
	public void setCultivateStaff(CultivateStaff cultivateStaff) {
		this.cultivateStaff = cultivateStaff;
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

}
