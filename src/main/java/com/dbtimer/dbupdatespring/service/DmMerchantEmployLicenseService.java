package com.dbtimer.dbupdatespring.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dbtimer.dbupdatespring.entity.DMmerchantEmployLicenseEntity;

import java.util.List;

/**
* @author 11092
* @description 针对表【ST_STBPRP_B】的数据库操作Service
* @createDate 2022-04-15 14:44:05
*/
public interface DmMerchantEmployLicenseService extends IService<DMmerchantEmployLicenseEntity> {

    List<DMmerchantEmployLicenseEntity> getAll();
}
