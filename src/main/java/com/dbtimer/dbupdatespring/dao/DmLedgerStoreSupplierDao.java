package com.dbtimer.dbupdatespring.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.dbtimer.dbupdatespring.entity.DMledgerStoreSupplierEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dbtimer.dbupdatespring.entity.ledgerStockItemEntity;
import com.dbtimer.dbupdatespring.entity.ledgerStoreSupplierEntity;
import com.dbtimer.dbupdatespring.entity.ledgerSupplierEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* @author swx
* @description 针对表【LedgerStoreSupplier】的数据库操作Mapper
* @createDate 2022-04-15 14:43:51
* @Entity com.dbtimer.dbupdatespring.entity.LedgerStoreSupplier
*/
@DS("dm")
@Mapper
public interface DmLedgerStoreSupplierDao extends BaseMapper<DMledgerStoreSupplierEntity> {
    void insert(ledgerStoreSupplierEntity _ledgerStoreSupplierEntity);
}




