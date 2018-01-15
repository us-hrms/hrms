package com.hrms.service;

import java.util.List;

import com.hrms.entity.Position;

public interface PositionService {
       /**
        * 查询所有职位
        */
	   List<Position> getPositions(Position position);
}
