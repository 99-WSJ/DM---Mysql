package com.dbtimer.dbupdatespring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dbtimer.dbupdatespring.dao.MysqlLedgerSupplierDao;
import com.dbtimer.dbupdatespring.dao.MysqlMerchantEmployeeDao;
import com.dbtimer.dbupdatespring.entity.ledgerSupplierEntity;
import com.dbtimer.dbupdatespring.entity.merchantEmployeeEntity;
import com.dbtimer.dbupdatespring.service.MerchantEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("MerchantEmployeeService")
public class MerchantEmployeeServiceImpl extends ServiceImpl<MysqlMerchantEmployeeDao, merchantEmployeeEntity> implements MerchantEmployeeService {
    @Autowired
    MysqlMerchantEmployeeDao mysqlMerchantEmployeeDao;
    @Override
    public List<merchantEmployeeEntity> getAll() {

        QueryWrapper<merchantEmployeeEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.select();
        return mysqlMerchantEmployeeDao.selectList(queryWrapper);
    }
    @Override
    public List<merchantEmployeeEntity> getAll_id() {

        QueryWrapper<merchantEmployeeEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id");              // 查询结果的顺序不是固定的，它受数据库中数据的物理存储和查询执行计划的影响
        queryWrapper.orderByAsc("id");            // 升序排序
        return mysqlMerchantEmployeeDao.selectList(queryWrapper);
    }
}
