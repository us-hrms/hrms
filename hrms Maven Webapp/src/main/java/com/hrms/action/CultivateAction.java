package com.hrms.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.Certificate;
import com.hrms.entity.Cultivate;
import com.hrms.page.Page;
import com.hrms.scope.ServletScopeAware;
import com.hrms.service.CertificateService;
import com.hrms.service.CultivateService;
import com.hrms.util.MenuHelper;

@Controller
@Scope("prototype")
public class CultivateAction extends ServletScopeAware {
	@Autowired
	private CultivateService cultivateService;
	@Autowired
	private CertificateService certificateService;
	private Cultivate cultivate;
    private String toJsp;
    private String toAction;
    private String itemId;
    
    public String cultivate(){
        List<Cultivate> CultivateList = cultivateService.getCultivates();
        Page page = new Page();
        page.setPageCountBySize(CultivateList.size());
        List<Cultivate> CultivateLists = cultivateService.getCultivates(new Cultivate(), page);
        List<Certificate> certificate = certificateService.getCertificates();
        request.setAttribute("CultivateLists", CultivateLists);
        request.setAttribute("certificate", certificate);
        request.setAttribute("page", page);
		//设置菜单选项
		if(itemId != null)
			MenuHelper.changeMenu(session, itemId);
    	this.toJsp = "jsp/cultivatePlan/cultivate";
    	return "tojsp";
    }
    
	public Cultivate getCultivate() {
		return cultivate;
	}
	public void setCultivate(Cultivate cultivate) {
		this.cultivate = cultivate;
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
