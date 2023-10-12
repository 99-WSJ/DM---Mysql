package com.dbtimer.dbupdatespring.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dbtimer.dbupdatespring.entity.DMmerchantStoreBussinessLabelEntity;
import com.dbtimer.dbupdatespring.entity.merchantStoreBussinessLabelEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* @author swx
* @description 针对表【MerchantStoreBussinessLabel(测点原始数据表，不包含效应量，是原始导入数据，未经过处理的数据)】的数据库操作Mapper
* @createDate 2022-04-15 14:44:57
* @Entity com.dbtimer.dbupdatespring.entity.MerchantStoreBussinessLabel
*/
@Mapper
@DS("dm")
public interface DmMerchantStoreBussinessLabelDao extends BaseMapper<DMmerchantStoreBussinessLabelEntity> {

    void insert(merchantStoreBussinessLabelEntity _merchantStoreBussinessLabelEntity);
}




