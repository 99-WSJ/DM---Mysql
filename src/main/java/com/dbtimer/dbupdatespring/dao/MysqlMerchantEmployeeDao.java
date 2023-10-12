package com.dbtimer.dbupdatespring.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dbtimer.dbupdatespring.entity.merchantEmployeeEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* @author swx
* @description 针对表【MerchantEmployee】的数据库操作Mapper
* @createDate 2022-04-15 14:43:57
* @Entity com.dbtimer.dbupdatespring.entity.MerchantEmployee
*/
@Mapper
@DS("mysql")
public interface MysqlMerchantEmployeeDao extends BaseMapper<merchantEmployeeEntity> {

}




