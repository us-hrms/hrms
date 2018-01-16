package com.hrms.service;

import java.util.List;

import com.hrms.entity.CultivateRecord;

public interface CultivateRecordService {
       /**
        * 查询培训记录以及根据条件查
        */
	    List<CultivateRecord> getCultivateRecords(CultivateRecord cultivateRecord);
}
