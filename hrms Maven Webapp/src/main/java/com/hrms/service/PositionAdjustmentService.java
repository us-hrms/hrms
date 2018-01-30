package com.hrms.service;

import java.io.Serializable;
import java.util.List;

import com.hrms.entity.PositionAdjustment;
import com.hrms.page.Page;

public interface PositionAdjustmentService {
	/**
     * ����ID��ѯ
     */
	PositionAdjustment getPositionAdjustment(Serializable id);
    /**
     * ��ѯȫ��
     */
	List<PositionAdjustment> getPositionAdjustment();
	/**
	 * ����������ѯ
	 */
    List<PositionAdjustment> getPositionAdjustment(PositionAdjustment positionAdjustment);
    /**
	 * ��ҳ��ѯ
	 */
    List<PositionAdjustment> getPositionAdjustment(PositionAdjustment positionAdjustment,Page page);
    /**
    * ����
    */
    Boolean updatePositionAdjustment(PositionAdjustment positionAdjustment);
    /**
    * ɾ��
    */
    Boolean deletePositionAdjustment(PositionAdjustment positionAdjustment);
}
