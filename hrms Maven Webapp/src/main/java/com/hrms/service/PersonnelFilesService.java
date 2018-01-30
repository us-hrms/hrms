package com.hrms.service;

import java.io.Serializable;
import java.util.List;

import com.hrms.entity.PersonnelFiles;
import com.hrms.page.Page;

public interface PersonnelFilesService {
	 /**
     * ����ID��ѯ
     */
	PersonnelFiles getPersonnelFiles(Serializable id);
    /**
     * ��ѯȫ��
     */
	List<PersonnelFiles> getPersonnelFiles();
	/**
	 * ����������ѯ
	 */
    List<PersonnelFiles> getPersonnelFiless(PersonnelFiles personnelFiles);
    /**
	 * ��ҳ��ѯ
	 */
    List<PersonnelFiles> getPersonnelFiless(PersonnelFiles personnelFiles,Page page);
    /**
    * ����
    */
    Boolean updatePersonnelFiles(PersonnelFiles personnelFiles);
    /**
    * ɾ��
    */
    Boolean deletePersonnelFiles(PersonnelFiles personnelFiles);
}
