package com.dbtimer.dbupdatespring.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.dbtimer.dbupdatespring.entity.DMmerchantEmployLicenseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dbtimer.dbupdatespring.entity.merchantEmployLicenseEntity;
import com.dbtimer.dbupdatespring.entity.merchantEmployeeEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* @author swx
* @description 针对表【MerchantEmployLicense】的数据库操作Mapper
* @createDate 2022-04-15 14:44:05
* @Entity com.dbtimer.dbupdatespring.entity.MerchantEmployLicense
*/
@Mapper
@DS("dm")
public interface DmMerchantEmployLicenseDao extends BaseMapper<DMmerchantEmployLicenseEntity> {

    void insert(merchantEmployLicenseEntity _merchantEmployLicenseEntity);
}




