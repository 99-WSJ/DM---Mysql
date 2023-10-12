package com.dbtimer.dbupdatespring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dbtimer.dbupdatespring.dao.DmMerchantStoreBussinessLabelDao;
import com.dbtimer.dbupdatespring.entity.DMmerchantStoreBussinessLabelEntity;
import com.dbtimer.dbupdatespring.service.DmMerchantStoreBussinessLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("dmMerchantStoreBussinessLabelService")
public class DmMerchantStoreBussinessLabelServiceImpl extends ServiceImpl<DmMerchantStoreBussinessLabelDao,DMmerchantStoreBussinessLabelEntity> implements DmMerchantStoreBussinessLabelService {

    @Autowired
    DmMerchantStoreBussinessLabelDao dmMerchantStoreBussinessLabelDao;

    @Override
    public List<DMmerchantStoreBussinessLabelEntity> getAll() {
//        QueryWrapper<DMmerchantStoreBussinessLabelEntity> queryWrapper = new QueryWrapper<>();
//        queryWrapper.select();
//        return dmMerchantStoreBussinessLabelDao.selectList(queryWrapper);
        return null;
    }
}
