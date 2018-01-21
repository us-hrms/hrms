package com.hrms.service;

import java.io.Serializable;
import java.util.List;

import com.hrms.entity.Holiday;

public interface HolidayService {
	    /**
	     * ����ID��ѯ
	     */
		Holiday getHoliday(Serializable id);
	    /**
	     * ��ѯȫ��
	     */
		List<Holiday> getHolidays();
	    /**
	     * ��������ѯ
	     */
	    List<Holiday> getHolidays(Holiday holiday);
	    /**
	     * ����
	     */
	    boolean updateHoliday(Holiday holiday);
	    /**
	     * ɾ��
	     */
	    boolean deleteHoliday(Holiday holiday);

}
