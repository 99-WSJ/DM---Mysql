package com.dbtimer.dbupdatespring.service;

import com.dbtimer.dbupdatespring.entity.ledgerStockItemEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 11092
* @description 针对表【OriginalMsgGPRS】的数据库操作Service
* @createDate 2022-04-15 14:41:31
*/
public interface LedgerStockItemService extends IService<ledgerStockItemEntity> {


    List<ledgerStockItemEntity> getAll();
    List<ledgerStockItemEntity> getAll_id();
}
