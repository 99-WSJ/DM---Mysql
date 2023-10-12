package com.dbtimer.dbupdatespring.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dbtimer.dbupdatespring.entity.DMledgerStockItemEntity;
import com.dbtimer.dbupdatespring.entity.ledgerSellItemEntity;
import com.dbtimer.dbupdatespring.entity.ledgerStockItemEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* @author swx
* @description 针对表【LedgerStockItem(测点的稳定信息，基本是不变的，且查询次数不频繁的信息)】的数据库操作Mapper
* @createDate 2022-04-15 14:45:14
* @Entity com.dbtimer.dbupdatespring.entity.LedgerStockItem
*/
@Mapper
@DS("dm")
public interface DmLedgerStockItemDao extends BaseMapper<DMledgerStockItemEntity> {
    void insert(ledgerStockItemEntity _ledgerStockItemItemEntity);
}




