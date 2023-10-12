package com.dbtimer.dbupdatespring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dbtimer.dbupdatespring.dao.DmMerchantEmployLicenseDao;
import com.dbtimer.dbupdatespring.entity.DMmerchantEmployLicenseEntity;
import com.dbtimer.dbupdatespring.service.DmMerchantEmployLicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("dmMerchantEmployLicenseService")
public class DmMerchantEmployLicenseServiceImpl extends ServiceImpl<DmMerchantEmployLicenseDao, DMmerchantEmployLicenseEntity>implements DmMerchantEmployLicenseService {

    @Autowired
    DmMerchantEmployLicenseDao dmMerchantEmployLicenseDao;

    @Override
    public List<DMmerchantEmployLicenseEntity> getAll() {
//        QueryWrapper<DMmerchantEmployLicenseEntity> queryWrapper = new QueryWrapper<>();
//        queryWrapper.select();
//        return dmMerchantEmployLicenseDao.selectList(queryWrapper);
        return null;
    }
}
