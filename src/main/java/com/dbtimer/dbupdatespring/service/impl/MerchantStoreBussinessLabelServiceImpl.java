package com.dbtimer.dbupdatespring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dbtimer.dbupdatespring.dao.MysqlMerchantEmployLicenseDao;
import com.dbtimer.dbupdatespring.dao.MysqlMerchantEmployeeDao;
import com.dbtimer.dbupdatespring.dao.MysqlMerchantStoreBussinessLabelDao;
import com.dbtimer.dbupdatespring.entity.merchantEmployLicenseEntity;
import com.dbtimer.dbupdatespring.entity.merchantStoreBussinessLabelEntity;
import com.dbtimer.dbupdatespring.service.MerchantStoreBussinessLabelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("MerchantStoreBussinessLabelService")
public class MerchantStoreBussinessLabelServiceImpl extends ServiceImpl<MysqlMerchantStoreBussinessLabelDao, merchantStoreBussinessLabelEntity> implements MerchantStoreBussinessLabelService {


    @Autowired
    MysqlMerchantStoreBussinessLabelDao mysqlMerchantStoreBussinessLabelDao;
    @Override
    public List<merchantStoreBussinessLabelEntity> getAll() {

        QueryWrapper<merchantStoreBussinessLabelEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.select();
        return mysqlMerchantStoreBussinessLabelDao.selectList(queryWrapper);
    }
    @Override
    public List<merchantStoreBussinessLabelEntity> getAll_id() {

        QueryWrapper<merchantStoreBussinessLabelEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id");              // 查询结果的顺序不是固定的，它受数据库中数据的物理存储和查询执行计划的影响
        queryWrapper.orderByAsc("id");            // 升序排序
        return mysqlMerchantStoreBussinessLabelDao.selectList(queryWrapper);
    }
}
