package com.hrms.service;

import java.util.List;

import com.hrms.entity.PunishmentReward;

public interface PunishmentRewardService {
       /**
        * ��ѯ������¼�Լ���������ѯ
        */
	  List<PunishmentReward> getPunishmentRewards(PunishmentReward punishmentReward);
}
