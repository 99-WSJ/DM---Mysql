package com.dbtimer.dbupdatespring.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.dbtimer.dbupdatespring.entity.ledgerStockItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author swx
* @description 针对表【LedgerStockItem
* @createDate 2022-04-15 14:45:14
* @Entity com.dbtimer.dbupdatespring.entity.LedgerStockItem
*/
@Mapper
@DS("mysql")
public interface MysqlLedgerStockItemDao extends BaseMapper<ledgerStockItemEntity> {

}




