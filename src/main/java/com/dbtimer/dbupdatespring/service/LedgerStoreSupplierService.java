package com.dbtimer.dbupdatespring.service;

import com.dbtimer.dbupdatespring.entity.ledgerStoreSupplierEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 11092
* @description 针对表【RunConfig】的数据库操作Service
* @createDate 2022-04-15 14:43:51
*/
public interface LedgerStoreSupplierService extends IService<ledgerStoreSupplierEntity> {

    List<ledgerStoreSupplierEntity> getAll();
    List<ledgerStoreSupplierEntity> getAll_id();

}
