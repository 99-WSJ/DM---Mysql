package com.dbtimer.dbupdatespring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dbtimer.dbupdatespring.dao.DmMerchantEmployeeDao;
import com.dbtimer.dbupdatespring.entity.DMmerchantEmployeeEntity;
import com.dbtimer.dbupdatespring.service.DmMerchantEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("dmMerchantEmployeeService")
public class DmMerchantEmployeeServiceImpl extends ServiceImpl<DmMerchantEmployeeDao,DMmerchantEmployeeEntity> implements DmMerchantEmployeeService {

    @Autowired
    DmMerchantEmployeeDao dmMerchantEmployeeDao;
    @Override
    public List<DMmerchantEmployeeEntity> getAll() {
//        QueryWrapper<DMmerchantEmployeeEntity> queryWrapper = new QueryWrapper<>();
//        queryWrapper.select();
//        return dmMerchantEmployeeDao.selectList(queryWrapper);
        return null;
    }
}
