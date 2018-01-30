package com.hrms.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.CultivateRecord;
import com.hrms.entity.DataDictionary;
import com.hrms.page.Page;
import com.hrms.scope.ServletScopeAware;
import com.hrms.service.CultivateRecordService;
import com.hrms.service.DataDictionaryService;
import com.hrms.util.MenuHelper;

@Controller
@Scope("prototype")
public class CultivateRecordAction extends ServletScopeAware {
	@Autowired
	private CultivateRecordService cultivateRecordService;
	@Autowired
	private DataDictionaryService dataDictionaryService;
	private CultivateRecord cultivateRecord;
    private String toJsp;
    private String toAction;
    private String itemId;
    
    public String cultivateRecord(){
    	DataDictionary dataDictionary =new DataDictionary();
    	dataDictionary.setTableColumn("CULTIVATERECORD_TYPE");//培训类别
        List<DataDictionary> dataDictionarylist = dataDictionaryService.getDataDictionarys(dataDictionary);
        DataDictionary dataDictionarys =new DataDictionary();
    	dataDictionarys.setTableColumn("CULTIVATESTAFF_PAYTYPE");//培训类型
        List<DataDictionary> dataDictionarylists = dataDictionaryService.getDataDictionarys(dataDictionary);
        List<CultivateRecord> cultivateRecordlist = cultivateRecordService.getCultivateRecords();
        Page page = new Page();
        page.setPageCountBySize(cultivateRecordlist.size());
        List<CultivateRecord> cultivateRecordlists = cultivateRecordService.getCultivateRecords(new CultivateRecord(), page);
        request.setAttribute("page", page);
        request.setAttribute("dataDictionarylist", dataDictionarylist);
        request.setAttribute("dataDictionarylists", dataDictionarylists);
        request.setAttribute("cultivateRecordlists", cultivateRecordlists);
        //设置菜单选项
		if(itemId != null)
			MenuHelper.changeMenu(session, itemId);
    	this.toJsp = "jsp/cultivatePlan/cultivateRecord";
    	return "tojsp";
    }
    
	public CultivateRecord getCultivateRecord() {
		return cultivateRecord;
	}
	public void setCultivateRecord(CultivateRecord cultivateRecord) {
		this.cultivateRecord = cultivateRecord;
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
