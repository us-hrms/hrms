package com.hrms.service;

import java.util.List;

import com.hrms.entity.Holiday;

public interface HolidayService {
	    /**
	     * 根据编号查询假期人员或者查询全部
	     */
	    List<Holiday> getHoliday(Holiday holiday);
}
