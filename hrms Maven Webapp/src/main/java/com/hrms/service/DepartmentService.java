package com.hrms.service;

import java.io.Serializable;
import java.util.List;

import com.hrms.entity.Department;

public interface DepartmentService {
	   /**
	    * ����ID��ѯ
	    */
		Department getDepartment(Serializable id);
	   /**
	    * ��������ѯ
	    * @return
	    */
       List<Department> getDepartments(Department department);
       /**
        * ��ѯȫ��
        */
       List<Department> getDepartments();
       /**
        * ����
        */
       boolean updateDepartment(Department department);
       /**
        * ɾ��
        */
       boolean deleteDepartment(Department department);
}
