package com.hrms.service;

import java.util.List;

import com.hrms.entity.Position;

public interface PositionService {
       /**
        * ��ѯ����ְλ
        */
	   List<Position> getPositions(Position position);
}
