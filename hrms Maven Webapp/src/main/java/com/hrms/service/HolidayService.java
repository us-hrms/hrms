package com.hrms.service;

import java.util.List;

import com.hrms.entity.Holiday;

public interface HolidayService {
	    /**
	     * ���ݱ�Ų�ѯ������Ա���߲�ѯȫ��
	     */
	    List<Holiday> getHoliday(Holiday holiday);
}
