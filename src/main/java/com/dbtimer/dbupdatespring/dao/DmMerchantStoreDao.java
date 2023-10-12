package com.dbtimer.dbupdatespring.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dbtimer.dbupdatespring.entity.DMmerchantStoreEntity;
import com.dbtimer.dbupdatespring.entity.merchantStoreBussinessLabelEntity;
import com.dbtimer.dbupdatespring.entity.merchantStoreEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* @author swx
* @description 针对表【MerchantStore
* @createDate 2022-04-15 14:44:43
* @Entity com.dbtimer.dbupdatespring.entity.MerchantStore
*/
@Mapper
@DS("dm")
public interface DmMerchantStoreDao extends BaseMapper<DMmerchantStoreEntity> {

    void insert(merchantStoreEntity _merchantStoreEntity);
}




