package com.dbtimer.dbupdatespring.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dbtimer.dbupdatespring.entity.DMmerchantStoreLicenseEntity;
import com.dbtimer.dbupdatespring.entity.merchantStoreEntity;
import com.dbtimer.dbupdatespring.entity.merchantStoreLicenseEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* @author swx
* @description 针对表【MerchantStoreLicense
* @createDate 2022-04-15 14:45:19
* @Entity com.dbtimer.dbupdatespring.entity.MerchantStoreLicense
*/
@Mapper
@DS("dm")
public interface DmMerchantStoreLicenseDao extends BaseMapper<DMmerchantStoreLicenseEntity> {

    void insert (merchantStoreLicenseEntity _merchantStoreLicenseEntity);
}




