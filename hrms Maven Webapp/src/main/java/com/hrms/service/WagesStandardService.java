package com.hrms.service;

import java.util.List;

import com.hrms.entity.WagesStandard;
import com.hrms.page.Page;

public interface WagesStandardService {
	/**
	 * ����н��
	 * @param wagesStandard
	 * @return
	 */
    Boolean saveWagesStandard(WagesStandard wagesStandard);
    /**
     * ����н��
     * @param wagesStandard
     * @return
     */
    Boolean updateWagesStandard(WagesStandard wagesStandard);
    /**��
     * ɾ��н��
     * @param wagesStandard
     * @return
     */
    Boolean deleteWagesStandard(WagesStandard wagesStandard);
    /**
     * ��ѯȫ��н��
     * @return
     */
    List<WagesStandard> getWagesStandards();
    /**
     * ��������н��
     * @param wagesStandard
     * @return
     */
    List<WagesStandard> getWagesStandards(WagesStandard wagesStandard);
    /**
     * ��ҳн��
     * @param wagesStandard
     * @return
     */
    List<WagesStandard> getWagesStandards(WagesStandard wagesStandard,Page page);
    /**
     * ����id��ѯ����н��
     * @param id
     * @return
     */
    WagesStandard getWagesStandard(WagesStandard id);
}
