package com.hrms.service;

import java.util.List;

import com.hrms.entity.Position;

public interface PositionService {
   
	/**
	 *��������ְλ
	 * @param position
	 * @return
	 */
	boolean savePosition(Position position);
	/**
	 * ����ְλ
	 * @param position
	 * @return
	 */
	boolean updatePosition(Position position);
	/**
	 * ɾ��ְλ
	 * @param position
	 * @return
	 */
	boolean deletePosition(Position position);
	/**
	 * ��ѯȫ������ְλ
	 * @return
	 */
	List<Position> getPositions();
	/**
	 * ����������ѯְλ
	 * @param position
	 * @return
	 */
	List<Position> getPositions(Position position);
	/**
	 * ����id��ѯ����ְλ
	 * @param id
	 * @return
	 */
	Position getPosition(Position id);
}
