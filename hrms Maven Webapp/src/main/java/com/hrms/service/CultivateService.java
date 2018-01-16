package com.hrms.service;

import java.util.List;

import com.hrms.entity.Cultivate;

public interface CultivateService {
		/**
		 * 查询培训平台和培训项目
		 */
	     List<Cultivate> getCultivates(Cultivate cultivate);
}
