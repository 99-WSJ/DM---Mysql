package com.dbtimer.dbupdatespring.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dbtimer.dbupdatespring.entity.DMledgerSupplierEntity;

import java.util.List;

/**
* @author 11092
* @description 针对表【LastData】的数据库操作Service
* @createDate 2022-04-15 11:34:46
*/
public interface DmLedgerSupplierService extends IService<DMledgerSupplierEntity> {
    List<DMledgerSupplierEntity> getAll();

}
