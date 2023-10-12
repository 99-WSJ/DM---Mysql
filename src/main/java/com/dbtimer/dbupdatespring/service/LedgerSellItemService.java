package com.dbtimer.dbupdatespring.service;

import com.dbtimer.dbupdatespring.entity.ledgerSellItemEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dbtimer.dbupdatespring.entity.ledgerSellerEntity;

import java.util.List;

/**
* @author 11092
* @description 针对表【BaseConfig】的数据库操作Service
* @createDate 2022-04-15 14:55:02
*/
public interface LedgerSellItemService extends IService<ledgerSellItemEntity> {


    List<ledgerSellItemEntity> getAll();
    List<ledgerSellItemEntity> getAll_id();
}
