package com.hrms.service;

import java.util.List;

import com.hrms.entity.PositionAdjustment;

public interface PositionAdjustmentService {
       /**
        * 查询所有职位聘任记录
        */
	   List<PositionAdjustment> getPositionAdjustments(PositionAdjustment positionAdjustment);
}
