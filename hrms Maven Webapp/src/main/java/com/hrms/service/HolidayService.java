package com.hrms.service;

import java.io.Serializable;
import java.util.List;

import com.hrms.entity.Holiday;

public interface HolidayService {
	    /**
	     * 根据ID查询
	     */
		Holiday getHoliday(Serializable id);
	    /**
	     * 查询全部
	     */
		List<Holiday> getHolidays();
	    /**
	     * 按条件查询
	     */
	    List<Holiday> getHolidays(Holiday holiday);
	    /**
	     * 更新
	     */
	    boolean updateHoliday(Holiday holiday);
	    /**
	     * 删除
	     */
	    boolean deleteHoliday(Holiday holiday);

}
