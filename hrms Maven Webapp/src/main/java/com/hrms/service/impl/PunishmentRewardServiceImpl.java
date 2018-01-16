package com.hrms.service.impl;

import java.util.List;

import com.hrms.dao.Dao;
import com.hrms.entity.PunishmentReward;
import com.hrms.service.PunishmentRewardService;

public class PunishmentRewardServiceImpl implements PunishmentRewardService {
    
	private Dao dao;
	@Override
	public List<PunishmentReward> getPunishmentRewards(
			PunishmentReward punishmentReward) {
		// TODO Auto-generated method stub
		return dao.find(punishmentReward);
	}
	
	public Dao getDao() {
		return dao;
	}
	public void setDao(Dao dao) {
		this.dao = dao;
	}
    
}
