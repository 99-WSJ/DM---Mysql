package com.dbtimer.dbupdatespring.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dbtimer.dbupdatespring.entity.DMledgerStockItemEntity;

import java.util.List;

/**
* @author 11092
* @description 针对表【OriginalMsgGPRS】的数据库操作Service
* @createDate 2022-04-15 14:41:31
*/
public interface DmLedgerStockItemService extends IService<DMledgerStockItemEntity> {
    List<DMledgerStockItemEntity> getAll();
}
