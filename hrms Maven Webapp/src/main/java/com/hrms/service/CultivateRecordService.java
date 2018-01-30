package com.hrms.service;

import java.io.Serializable;
import java.util.List;

import com.hrms.entity.CultivateRecord;
import com.hrms.page.Page;

public interface CultivateRecordService {
	
	/**
	 * ����
	 * @param cultivateRecord
	 * @return
	 */
	Boolean update(CultivateRecord cultivateRecord);
	
	/**
	 * ɾ��
	 * @param cultivateRecord
	 */
	Boolean deleteCultivateRecord(CultivateRecord cultivateRecord);
	
	/**
	 * ����id���һ��CultivateRecord
	 * @param id
	 * @return
	 */
	CultivateRecord getCultivateRecord(Serializable id);
	
	
	/**
	 * �������CultivateRecord
	 * @return
	 */
	List<CultivateRecord> getCultivateRecords();
	
	
	/**
	 * ��������ѯ
	 * @param cultivateRecord
	 * @return
	 */
	List<CultivateRecord> getCultivateRecords(CultivateRecord cultivateRecord);
	/**
	 * ��ҳ��ѯ
	 * @param cultivateRecord
	 * @return
	 */
	List<CultivateRecord> getCultivateRecords(CultivateRecord cultivateRecord,Page page);
}
