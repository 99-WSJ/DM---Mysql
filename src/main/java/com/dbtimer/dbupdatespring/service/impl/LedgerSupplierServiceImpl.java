package com.dbtimer.dbupdatespring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dbtimer.dbupdatespring.dao.MysqlLedgerStoreSupplierDao;
import com.dbtimer.dbupdatespring.dao.MysqlLedgerSupplierDao;
import com.dbtimer.dbupdatespring.entity.ledgerStoreSupplierEntity;
import com.dbtimer.dbupdatespring.entity.ledgerSupplierEntity;
import com.dbtimer.dbupdatespring.service.LedgerSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("LedgerSupplierService")
public class LedgerSupplierServiceImpl extends ServiceImpl<MysqlLedgerSupplierDao, ledgerSupplierEntity> implements LedgerSupplierService {


    @Autowired
    MysqlLedgerSupplierDao mysqlLedgerSupplierDao;
    @Override
    public List<ledgerSupplierEntity> getAll() {

        QueryWrapper<ledgerSupplierEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.select();
        return mysqlLedgerSupplierDao.selectList(queryWrapper);
    }
    @Override
    public List<ledgerSupplierEntity> getAll_id() {

        QueryWrapper<ledgerSupplierEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id");              // 查询结果的顺序不是固定的，它受数据库中数据的物理存储和查询执行计划的影响
        queryWrapper.orderByAsc("id");            // 升序排序
        return mysqlLedgerSupplierDao.selectList(queryWrapper);
    }
}
