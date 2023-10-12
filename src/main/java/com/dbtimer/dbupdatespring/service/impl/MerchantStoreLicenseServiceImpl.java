package com.dbtimer.dbupdatespring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dbtimer.dbupdatespring.dao.MysqlMerchantStoreBussinessLabelDao;
import com.dbtimer.dbupdatespring.dao.MysqlMerchantStoreLicenseDao;
import com.dbtimer.dbupdatespring.entity.merchantStoreBussinessLabelEntity;
import com.dbtimer.dbupdatespring.entity.merchantStoreLicenseEntity;
import com.dbtimer.dbupdatespring.service.MerchantStoreLicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("MerchantStoreLicenseService")
public class MerchantStoreLicenseServiceImpl  extends ServiceImpl<MysqlMerchantStoreLicenseDao, merchantStoreLicenseEntity> implements MerchantStoreLicenseService {


    @Autowired
    MysqlMerchantStoreLicenseDao mysqlMerchantStoreLicenseDao;
    @Override
    public List<merchantStoreLicenseEntity> getAll() {

        QueryWrapper<merchantStoreLicenseEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.select();
        return mysqlMerchantStoreLicenseDao.selectList(queryWrapper);
    }
    @Override
    public List<merchantStoreLicenseEntity> getAll_id() {

        QueryWrapper<merchantStoreLicenseEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id");              // 查询结果的顺序不是固定的，它受数据库中数据的物理存储和查询执行计划的影响
        queryWrapper.orderByAsc("id");            // 升序排序
        return mysqlMerchantStoreLicenseDao.selectList(queryWrapper);
    }
}
