package com.hrms.service;

import java.util.List;

import com.hrms.entity.CultivateRecord;

public interface CultivateRecordService {
       /**
        * ��ѯ��ѵ��¼�Լ�����������
        */
	    List<CultivateRecord> getCultivateRecords(CultivateRecord cultivateRecord);
}
