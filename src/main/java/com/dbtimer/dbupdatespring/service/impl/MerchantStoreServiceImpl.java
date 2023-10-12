package com.dbtimer.dbupdatespring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dbtimer.dbupdatespring.dao.MysqlMerchantStoreDao;
import com.dbtimer.dbupdatespring.dao.MysqlMerchantStoreLicenseDao;
import com.dbtimer.dbupdatespring.entity.merchantStoreEntity;
import com.dbtimer.dbupdatespring.entity.merchantStoreLicenseEntity;
import com.dbtimer.dbupdatespring.service.MerchantStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("MerchantStoreService")
public class MerchantStoreServiceImpl extends ServiceImpl<MysqlMerchantStoreDao, merchantStoreEntity> implements MerchantStoreService {


    @Autowired
    MysqlMerchantStoreDao mysqlMerchantStoreDao;
    @Override
    public List<merchantStoreEntity> getAll() {

        QueryWrapper<merchantStoreEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.select();
        return mysqlMerchantStoreDao.selectList(queryWrapper);
    }
    @Override
    public List<merchantStoreEntity> getAll_id() {

        QueryWrapper<merchantStoreEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id");              // 查询结果的顺序不是固定的，它受数据库中数据的物理存储和查询执行计划的影响
        queryWrapper.orderByAsc("id");            // 升序排序
        return mysqlMerchantStoreDao.selectList(queryWrapper);
    }
}
