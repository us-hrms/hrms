package com.hrms.service;

import java.util.List;

import com.hrms.entity.PositionAdjustment;

public interface PositionAdjustmentService {
       /**
        * ��ѯ����ְλƸ�μ�¼
        */
	   List<PositionAdjustment> getPositionAdjustments(PositionAdjustment positionAdjustment);
}
