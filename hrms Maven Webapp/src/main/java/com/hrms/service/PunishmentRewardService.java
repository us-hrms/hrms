package com.hrms.service;

import java.util.List;

import com.hrms.entity.PunishmentReward;

public interface PunishmentRewardService {
       /**
        * 查询奖罚记录以及按条件查询
        */
	  List<PunishmentReward> getPunishmentRewards(PunishmentReward punishmentReward);
}
