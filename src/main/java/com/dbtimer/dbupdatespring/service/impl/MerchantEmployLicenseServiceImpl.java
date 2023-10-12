package com.dbtimer.dbupdatespring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dbtimer.dbupdatespring.dao.MysqlMerchantEmployLicenseDao;
import com.dbtimer.dbupdatespring.dao.MysqlMerchantEmployeeDao;
import com.dbtimer.dbupdatespring.entity.merchantEmployLicenseEntity;
import com.dbtimer.dbupdatespring.entity.merchantEmployeeEntity;
import com.dbtimer.dbupdatespring.service.MerchantEmployLicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MerchantEmployLicenseService")
public class MerchantEmployLicenseServiceImpl extends ServiceImpl<MysqlMerchantEmployLicenseDao, merchantEmployLicenseEntity> implements MerchantEmployLicenseService {


    @Autowired
    MysqlMerchantEmployLicenseDao mysqlMerchantEmployLicenseDao;
    @Override
    public List<merchantEmployLicenseEntity> getAll() {

        QueryWrapper<merchantEmployLicenseEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.select();
        return mysqlMerchantEmployLicenseDao.selectList(queryWrapper);
    }
    @Override
    public List<merchantEmployLicenseEntity> getAll_id() {

        QueryWrapper<merchantEmployLicenseEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id");              // 查询结果的顺序不是固定的，它受数据库中数据的物理存储和查询执行计划的影响
        queryWrapper.orderByAsc("id");            // 升序排序
        return mysqlMerchantEmployLicenseDao.selectList(queryWrapper);
    }
}
