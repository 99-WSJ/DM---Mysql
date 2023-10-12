package com.dbtimer.dbupdatespring.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.dbtimer.dbupdatespring.entity.merchantStoreLicenseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author swx
* @description 针对表【MerchantStoreLicense
 * @createDate 2022-04-15 14:45:19
* @Entity com.dbtimer.dbupdatespring.entity.MerchantStoreLicense
*/
@Mapper
@DS("mysql")
public interface MysqlMerchantStoreLicenseDao extends BaseMapper<merchantStoreLicenseEntity> {

}




