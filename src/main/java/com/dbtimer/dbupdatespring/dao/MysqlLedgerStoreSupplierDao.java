package com.dbtimer.dbupdatespring.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dbtimer.dbupdatespring.entity.ledgerStoreSupplierEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* @author swx
* @description 针对表【LedgerStoreSupplier】的数据库操作Mapper
* @createDate 2022-04-15 14:43:51
* @Entity com.dbtimer.dbupdatespring.entity.LedgerStoreSupplier
*/
@DS("mysql")
@Mapper
public interface MysqlLedgerStoreSupplierDao extends BaseMapper<ledgerStoreSupplierEntity> {

}




