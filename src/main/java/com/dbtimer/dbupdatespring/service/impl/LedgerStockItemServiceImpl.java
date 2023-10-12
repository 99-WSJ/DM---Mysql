package com.dbtimer.dbupdatespring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dbtimer.dbupdatespring.dao.MysqlLedgerSellItemDao;
import com.dbtimer.dbupdatespring.dao.MysqlLedgerStockItemDao;
import com.dbtimer.dbupdatespring.entity.ledgerSellItemEntity;
import com.dbtimer.dbupdatespring.entity.ledgerSellerEntity;
import com.dbtimer.dbupdatespring.entity.ledgerStockItemEntity;
import com.dbtimer.dbupdatespring.service.LedgerStockItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("LedgerStockItemService")
public class LedgerStockItemServiceImpl extends ServiceImpl<MysqlLedgerStockItemDao, ledgerStockItemEntity>implements LedgerStockItemService {

    @Autowired
    MysqlLedgerStockItemDao mysqlLedgerStockItemDao;
    @Override
    public List<ledgerStockItemEntity> getAll() {

        QueryWrapper<ledgerStockItemEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.select();
        return mysqlLedgerStockItemDao.selectList(queryWrapper);
    }
    @Override
    public List<ledgerStockItemEntity> getAll_id() {

        QueryWrapper<ledgerStockItemEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id");              // 查询结果的顺序不是固定的，它受数据库中数据的物理存储和查询执行计划的影响
        queryWrapper.orderByAsc("id");            // 升序排序
        return mysqlLedgerStockItemDao.selectList(queryWrapper);
    }
}


