package com.dbtimer.dbupdatespring.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.dbtimer.dbupdatespring.entity.DMledgerSellItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dbtimer.dbupdatespring.entity.ledgerSellItemEntity;
import org.apache.ibatis.annotations.Mapper;

/**
* @author swx
* @description 针对表【LedgerSellItem】的数据库操作Mapper
* @createDate 2022-04-15 14:55:02
* @Entity com.dbtimer.dbupdatespring.entity.LedgerSellItem
*/
@Mapper
@DS("dm")
public interface DmLedgerSellItemDao extends BaseMapper<DMledgerSellItemEntity> {

     void insert(ledgerSellItemEntity _ledgerSellItemEntity);


}




