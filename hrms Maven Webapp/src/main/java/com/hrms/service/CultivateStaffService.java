package com.hrms.service;

import java.util.List;

import com.hrms.entity.CultivateStaff;

public interface CultivateStaffService {
       /**
        * ��ѯԱ����ѵ�ɼ��Լ�����������
        */
	   List<CultivateStaff> getCultivateStaffs(CultivateStaff cultivateStaff);
}
