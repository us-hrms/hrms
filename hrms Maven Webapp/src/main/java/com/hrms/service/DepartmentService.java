package com.hrms.service;

import java.io.Serializable;
import java.util.List;

import com.hrms.entity.Department;
import com.hrms.page.Page;

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
	    * ��ҳ��ѯ
	    * @return
	    */
       List<Department> getDepartments(Department department,Page page);
       /**
        * ��ѯȫ��
        */
       List<Department> getDepartments();
       /**
        * ����
        */
       Boolean updateDepartment(Department department);
       /**
        * ɾ��
        */
       Boolean deleteDepartment(Department department);
}
