package com.dbtimer.dbupdatespring.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.dbtimer.dbupdatespring.entity.merchantStoreEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author swx
* @description 针对表【MerchantStore
* @createDate 2022-04-15 14:44:43
* @Entity com.dbtimer.dbupdatespring.entity.MerchantStore
*/
@Mapper
@DS("mysql")
public interface MysqlMerchantStoreDao extends BaseMapper<merchantStoreEntity> {

}




