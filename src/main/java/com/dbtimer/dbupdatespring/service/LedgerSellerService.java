package com.dbtimer.dbupdatespring.service;

import com.dbtimer.dbupdatespring.entity.DMledgerSellerEntity;
import com.dbtimer.dbupdatespring.entity.ledgerSellerEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 11092
* @description 针对表【OriginalData】的数据库操作Service
* @createDate 2022-04-15 14:39:01
*/
public interface LedgerSellerService extends IService<ledgerSellerEntity> {

    List<ledgerSellerEntity> getAll();
    List<ledgerSellerEntity> getAll_id();
}
