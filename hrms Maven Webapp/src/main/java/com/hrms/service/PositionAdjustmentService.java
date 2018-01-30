package com.hrms.service;

import java.io.Serializable;
import java.util.List;

import com.hrms.entity.PositionAdjustment;
import com.hrms.page.Page;

public interface PositionAdjustmentService {
	/**
     * 根据ID查询
     */
	PositionAdjustment getPositionAdjustment(Serializable id);
    /**
     * 查询全部
     */
	List<PositionAdjustment> getPositionAdjustment();
	/**
	 * 根据条件查询
	 */
    List<PositionAdjustment> getPositionAdjustment(PositionAdjustment positionAdjustment);
    /**
	 * 分页查询
	 */
    List<PositionAdjustment> getPositionAdjustment(PositionAdjustment positionAdjustment,Page page);
    /**
    * 更新
    */
    Boolean updatePositionAdjustment(PositionAdjustment positionAdjustment);
    /**
    * 删除
    */
    Boolean deletePositionAdjustment(PositionAdjustment positionAdjustment);
}
