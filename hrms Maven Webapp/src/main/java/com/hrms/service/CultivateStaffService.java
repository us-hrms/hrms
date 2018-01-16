package com.hrms.service;

import java.util.List;

import com.hrms.entity.CultivateStaff;

public interface CultivateStaffService {
       /**
        * 查询员工培训成绩以及根据条件查
        */
	   List<CultivateStaff> getCultivateStaffs(CultivateStaff cultivateStaff);
}
