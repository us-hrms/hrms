package com.hrms.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.hrms.entity.Department;
import com.hrms.entity.Position;
import com.hrms.page.Page;
import com.hrms.scope.ServletScopeAware;
import com.hrms.service.DepartmentService;
import com.hrms.service.PositionService;
import com.hrms.util.MenuHelper;

@Controller
@Scope("prototype")
public class PositionAction extends ServletScopeAware {
	@Autowired
	private DepartmentService departmentService;
	@Autowired
	private PositionService positionService;
    private String toJsp;
    private String toAction;
    private Position position;
    private String itemId;
    private Page page;
    
    public String position(){
    	List<Department> departments = departmentService.getDepartments();
        List<Position> positionss = positionService.getPositions();
        Page page = new Page();
        page.setPageCountBySize(positionss.size());
        List<Position> positions = positionService.getPositions(new Position(), page);
        request.setAttribute("departments",departments);
        request.setAttribute("positionss",positionss);
        request.setAttribute("positions",positions);
        request.setAttribute("page",page);
		//���ò˵�ѡ��
		if(itemId != null)
			MenuHelper.changeMenu(session, itemId);
    	toJsp = "jsp/personnelManager/position";
    	return "tojsp";
    }
    /**
     * ������
     * @return
     */
    public String condition(){
    	  List<Department> departments = departmentService.getDepartments();
    	  List<Position> positionsss = positionService.getPositions();
    	  List<Position> positionss = positionService.getPositions(position);
          Page page = new Page();
          page.setPageCountBySize(positionss.size());
          List<Position> positions = positionService.getPositions(position, page);
          request.setAttribute("positionss",positionsss);
          request.setAttribute("positions",positions);
          request.setAttribute("page",page);
          request.setAttribute("departments",departments);
    	toJsp = "jsp/personnelManager/position";
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
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}

	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public String getItemId() {
		return itemId;
	}


	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

    

}
