package com.hrms.service;

import java.util.List;

import com.hrms.entity.Department;

public interface DepartmentService {
	   /**
	    * ��ѯ���в���
	    * @return
	    */
       List<Department> getDepartments(Department department);
}
