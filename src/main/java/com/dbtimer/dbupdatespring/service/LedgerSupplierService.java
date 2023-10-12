package com.dbtimer.dbupdatespring.service;

import com.dbtimer.dbupdatespring.entity.ledgerSupplierEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 11092
* @description 针对表【LastData】的数据库操作Service
* @createDate 2022-04-15 11:34:46
*/
public interface LedgerSupplierService extends IService<ledgerSupplierEntity> {


    List<ledgerSupplierEntity> getAll();
    List<ledgerSupplierEntity> getAll_id();
}
