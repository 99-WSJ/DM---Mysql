package com.dbtimer.dbupdatespring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dbtimer.dbupdatespring.dao.MysqlLedgerSellItemDao;
import com.dbtimer.dbupdatespring.dao.MysqlLedgerSellerDao;
import com.dbtimer.dbupdatespring.entity.ledgerSellItemEntity;
import com.dbtimer.dbupdatespring.entity.ledgerSellerEntity;
import com.dbtimer.dbupdatespring.service.LedgerSellItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("LedgerSellItemService")
public class LedgerSellItemServiceImpl extends ServiceImpl<MysqlLedgerSellItemDao,ledgerSellItemEntity>implements LedgerSellItemService {

    @Autowired
    MysqlLedgerSellItemDao mysqlLedgerSellItemDao;
    @Override
    public List<ledgerSellItemEntity> getAll() {

        QueryWrapper<ledgerSellItemEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.select();
        return mysqlLedgerSellItemDao.selectList(queryWrapper);
    }

    @Override
    public List<ledgerSellItemEntity> getAll_id() {

        QueryWrapper<ledgerSellItemEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id");              // 查询结果的顺序不是固定的，它受数据库中数据的物理存储和查询执行计划的影响
        queryWrapper.orderByAsc("id");            // 升序排序
        return mysqlLedgerSellItemDao.selectList(queryWrapper);
    }

}
