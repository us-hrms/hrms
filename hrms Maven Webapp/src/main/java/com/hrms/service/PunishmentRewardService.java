package com.hrms.service;

import java.util.List;

import com.hrms.entity.PunishmentReward;
import com.hrms.page.Page;

public interface PunishmentRewardService {
      
	/**
	 * ���潱����¼
	 * @param punishmentReward
	 * @return
	 */
	Boolean savePunishmentReward(PunishmentReward punishmentReward);
	/**
	 * ���½�����¼
	 * @param punishmentReward
	 * @return
	 */
	Boolean updatePunishmentReward(PunishmentReward punishmentReward);
	/**
	 * ɾ��������¼
	 * @param punishmentReward
	 * @return
	 */
	Boolean deletePunishmentReward(PunishmentReward punishmentReward);
	/**
	 * ��ѯȫ��������¼
	 * @return
	 */
	List<PunishmentReward> getPunishmentRewards();
	/**
	 * ����������ѯ������¼
	 * @param punishmentReward
	 * @return
	 */
	List<PunishmentReward> getPunishmentRewards(PunishmentReward punishmentReward);
	/**
	 * ��ҳ��ѯ������¼
	 * @param punishmentReward
	 * @return
	 */
	List<PunishmentReward> getPunishmentRewards(PunishmentReward punishmentReward,Page page);
	/**
	 * ����id��ѯ����������¼
	 * @param id
	 * @return
	 */
	PunishmentReward getPunishmentReward(PunishmentReward id);
}
