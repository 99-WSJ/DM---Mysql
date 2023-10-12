package com.dbtimer.dbupdatespring.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dbtimer.dbupdatespring.entity.DMledgerSellerEntity;

import java.util.List;

/**
* @author 11092
* @description 针对表【OriginalData】的数据库操作Service
* @createDate 2022-04-15 14:39:01
*/
public interface DmLedgerSellerService extends IService<DMledgerSellerEntity> {

    List<DMledgerSellerEntity> getAll();

}
