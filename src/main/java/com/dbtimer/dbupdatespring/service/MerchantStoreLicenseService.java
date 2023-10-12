package com.dbtimer.dbupdatespring.service;

import com.dbtimer.dbupdatespring.entity.merchantStoreLicenseEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 11092
* @description 针对表【point_info_important(测点信息管理--该表存放测点的一些重要信息)】的数据库操作Service
* @createDate 2022-04-15 14:45:19
*/
public interface MerchantStoreLicenseService extends IService<merchantStoreLicenseEntity> {

    List<merchantStoreLicenseEntity> getAll();
    List<merchantStoreLicenseEntity> getAll_id();
}
