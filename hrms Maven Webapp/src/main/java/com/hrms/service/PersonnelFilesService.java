package com.hrms.service;

import java.util.List;

import com.hrms.entity.PersonnelFiles;

public interface PersonnelFilesService {
       /**
        * 查询所有人事档案
        */
	   List<PersonnelFiles> getPersonnelFiless(PersonnelFiles personnelFiles);
}
