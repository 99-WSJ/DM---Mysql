package com.dbtimer.dbupdatespring.service;

import com.dbtimer.dbupdatespring.entity.merchantStoreBussinessLabelEntity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author 11092
* @description 针对表【data_points_original(测点原始数据表，不包含效应量，是原始导入数据，未经过处理的数据)】的数据库操作Service
* @createDate 2022-04-15 14:44:57
*/
public interface MerchantStoreBussinessLabelService extends IService<merchantStoreBussinessLabelEntity> {

    List<merchantStoreBussinessLabelEntity> getAll();
    List<merchantStoreBussinessLabelEntity> getAll_id();
}
