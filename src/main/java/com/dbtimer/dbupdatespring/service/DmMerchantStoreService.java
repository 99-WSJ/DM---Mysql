package com.dbtimer.dbupdatespring.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dbtimer.dbupdatespring.entity.DMmerchantStoreEntity;
import com.dbtimer.dbupdatespring.entity.DMmerchantStoreLicenseEntity;

import java.util.List;

/**
* @author 11092
* @description 针对表【data_points(观测数据经过处理后，且通过公式计算后得到效应量以后的数据序列)】的数据库操作Service
* @createDate 2022-04-15 14:44:43
*/
public interface DmMerchantStoreService extends IService<DMmerchantStoreEntity> {
    List<DMmerchantStoreEntity> getAll();


}
