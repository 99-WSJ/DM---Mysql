package com.dbtimer.dbupdatespring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dbtimer.dbupdatespring.dao.DmMerchantStoreDao;
import com.dbtimer.dbupdatespring.entity.DMmerchantStoreEntity;
import com.dbtimer.dbupdatespring.service.DmMerchantStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("dmMerchantStoreService")
public class DmMerchantStoreServiceImpl extends ServiceImpl<DmMerchantStoreDao,DMmerchantStoreEntity>implements DmMerchantStoreService {

    @Autowired
    DmMerchantStoreDao dmMerchantStoreDao;
    @Override
    public List<DMmerchantStoreEntity> getAll() {
//        QueryWrapper<DMmerchantStoreEntity> queryWrapper = new QueryWrapper<>();
//        queryWrapper.select();
//        return dmMerchantStoreDao.selectList(queryWrapper);
        return null;
    }
}
