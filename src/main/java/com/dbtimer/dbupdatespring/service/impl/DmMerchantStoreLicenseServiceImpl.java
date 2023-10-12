package com.dbtimer.dbupdatespring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dbtimer.dbupdatespring.dao.DmMerchantStoreLicenseDao;
import com.dbtimer.dbupdatespring.entity.DMmerchantStoreLicenseEntity;
import com.dbtimer.dbupdatespring.service.DmMerchantStoreLicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dmMerchantStoreLicenseService")
public class DmMerchantStoreLicenseServiceImpl extends ServiceImpl<DmMerchantStoreLicenseDao,DMmerchantStoreLicenseEntity>implements DmMerchantStoreLicenseService {

    @Autowired
    DmMerchantStoreLicenseDao dmMerchantStoreLicenseDao;

    @Override
    public List<DMmerchantStoreLicenseEntity> getAll() {
//        QueryWrapper<DMmerchantStoreLicenseEntity> queryWrapper = new QueryWrapper<>();
//        queryWrapper.select();
//        return dmMerchantStoreLicenseDao.selectList(queryWrapper);
        return null;
    }
}
