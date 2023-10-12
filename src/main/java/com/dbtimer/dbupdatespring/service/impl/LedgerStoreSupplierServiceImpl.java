package com.dbtimer.dbupdatespring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dbtimer.dbupdatespring.dao.MysqlLedgerStockItemDao;
import com.dbtimer.dbupdatespring.dao.MysqlLedgerStoreSupplierDao;
import com.dbtimer.dbupdatespring.entity.ledgerStockItemEntity;
import com.dbtimer.dbupdatespring.entity.ledgerStoreSupplierEntity;
import com.dbtimer.dbupdatespring.service.LedgerStoreSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("LedgerStoreSupplierService")
public class LedgerStoreSupplierServiceImpl extends ServiceImpl<MysqlLedgerStoreSupplierDao, ledgerStoreSupplierEntity> implements LedgerStoreSupplierService {


    @Autowired
    MysqlLedgerStoreSupplierDao mysqlLedgerStoreSupplierDao;
    @Override
    public List<ledgerStoreSupplierEntity> getAll() {

        QueryWrapper<ledgerStoreSupplierEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.select();
        return mysqlLedgerStoreSupplierDao.selectList(queryWrapper);
    }
    @Override
    public List<ledgerStoreSupplierEntity> getAll_id() {

        QueryWrapper<ledgerStoreSupplierEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id");              // 查询结果的顺序不是固定的，它受数据库中数据的物理存储和查询执行计划的影响
        queryWrapper.orderByAsc("id");            // 升序排序
        return mysqlLedgerStoreSupplierDao.selectList(queryWrapper);
    }
}
