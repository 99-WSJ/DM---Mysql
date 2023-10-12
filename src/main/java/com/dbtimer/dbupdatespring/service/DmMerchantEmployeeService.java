package com.dbtimer.dbupdatespring.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dbtimer.dbupdatespring.entity.DMmerchantEmployeeEntity;

import java.util.List;

/**
* @author 11092
* @description 针对表【SendCmd】的数据库操作Service
* @createDate 2022-04-15 14:43:57
*/
public interface DmMerchantEmployeeService extends IService<DMmerchantEmployeeEntity> {
 List<DMmerchantEmployeeEntity> getAll();
}
