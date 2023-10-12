package com.dbtimer.dbupdatespring.service;

import com.dbtimer.dbupdatespring.entity.merchantEmployeeEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 11092
* @description 针对表【SendCmd】的数据库操作Service
* @createDate 2022-04-15 14:43:57
*/
public interface MerchantEmployeeService extends IService<merchantEmployeeEntity> {

    List<merchantEmployeeEntity> getAll();
    List<merchantEmployeeEntity> getAll_id();
}
