package com.hrms.service;

import java.io.Serializable;
import java.util.List;

import com.hrms.entity.CultivateStaff;

public interface CultivateStaffService {
	    /**
	     * ����
	     */
		boolean updateCultivateStaff(CultivateStaff cultivateStaff);
	   /**
	    * ɾ��
	    */
		boolean deleteCultivateStaff(CultivateStaff cultivateStaff);
	   /**
	    * ����ID��ѯ
	    */
		CultivateStaff getCultivateStaff(Serializable id);
	   /**
	    * ��ѯȫ��
	    * @return
	    */
	   List<CultivateStaff> getCultivateStaffs();
       /**
        * ��������ѯ
        */
	   List<CultivateStaff> getCultivateStaffs(CultivateStaff cultivateStaff);
}
