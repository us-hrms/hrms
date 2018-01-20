package com.hrms.service;

import java.util.List;

import com.hrms.entity.StaffContract;

public interface StaffContractService {
	   /**
	    * 保存员工合同
	    * @param staffContract
	    * @return
	    */
	   boolean saveStaffContract(StaffContract staffContract);
	   /**
	    * 更新员工合同
	    * @param staffContract
	    * @return
	    */
	   boolean updateStaffContract(StaffContract staffContract);
	   /**
	    * 删除员工合同
	    * @param staffContract
	    * @return
	    */
	   boolean deleteStaffContract(StaffContract staffContract);
	   /**
	    * 查询所有员工合同
	    * @return
	    */
	   List<StaffContract> getStaffContracts();
	   /** 
        * 根据条件查询员工合同
        */
	   List<StaffContract>  getStaffContracts(StaffContract staffContract);
	   /**
	    * 根据id查询单个员工合同
	    * @param id
	    * @return
	    */
	   StaffContract getStaffContract(StaffContract id);
	   
}
