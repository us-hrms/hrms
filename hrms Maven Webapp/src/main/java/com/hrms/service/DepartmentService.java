package com.hrms.service;

import java.util.List;

import com.hrms.entity.Department;

public interface DepartmentService {
	   /**
	    * 查询所有部门
	    * @return
	    */
       List<Department> getDepartments(Department department);
}
