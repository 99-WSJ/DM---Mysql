package com.dbtimer.dbupdatespring.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.dbtimer.dbupdatespring.entity.merchantStoreBussinessLabelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author swx
* @description 针对表【MerchantStoreBussinessLabel
* @createDate 2022-04-15 14:44:57
* @Entity com.dbtimer.dbupdatespring.entity.MerchantStoreBussinessLabel
*/
@Mapper
@DS("mysql")
public interface MysqlMerchantStoreBussinessLabelDao extends BaseMapper<merchantStoreBussinessLabelEntity> {

}




