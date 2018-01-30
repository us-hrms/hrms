package com.hrms.service;

import java.io.Serializable;
import java.util.List;

import com.hrms.entity.PersonnelFiles;
import com.hrms.page.Page;

public interface PersonnelFilesService {
	 /**
     * 根据ID查询
     */
	PersonnelFiles getPersonnelFiles(Serializable id);
    /**
     * 查询全部
     */
	List<PersonnelFiles> getPersonnelFiles();
	/**
	 * 根据条件查询
	 */
    List<PersonnelFiles> getPersonnelFiless(PersonnelFiles personnelFiles);
    /**
	 * 分页查询
	 */
    List<PersonnelFiles> getPersonnelFiless(PersonnelFiles personnelFiles,Page page);
    /**
    * 更新
    */
    Boolean updatePersonnelFiles(PersonnelFiles personnelFiles);
    /**
    * 删除
    */
    Boolean deletePersonnelFiles(PersonnelFiles personnelFiles);
}
