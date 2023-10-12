package com.dbtimer.dbupdatespring.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.dbtimer.dbupdatespring.entity.DMledgerSupplierEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dbtimer.dbupdatespring.entity.ledgerSupplierEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* @author swx
* @description 针对表【LedgerSupplier】的数据库操作Mapper
* @createDate 2022-04-15 11:34:46
* @Entity com.dbtimer.dbupdatespring.entity.LedgerSupplier
*/
@Mapper
@DS("dm")
public interface DmLedgerSupplierDao extends BaseMapper<DMledgerSupplierEntity> {

    void insert(ledgerSupplierEntity _ledgerSupplierEntity);
}




