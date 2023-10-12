package com.dbtimer.dbupdatespring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dbtimer.dbupdatespring.dao.DmLedgerSellerDao;
import com.dbtimer.dbupdatespring.dao.MysqlLedgerSellerDao;
import com.dbtimer.dbupdatespring.entity.DMledgerSellerEntity;
import com.dbtimer.dbupdatespring.entity.ledgerSellItemEntity;
import com.dbtimer.dbupdatespring.entity.ledgerSellerEntity;
import com.dbtimer.dbupdatespring.service.LedgerSellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("LedgerSellService")
public class LedgerSellerServiceImpl extends ServiceImpl<MysqlLedgerSellerDao, ledgerSellerEntity> implements LedgerSellerService {

    @Autowired
    MysqlLedgerSellerDao mysqlLedgerSellerDao;

    @Override
    public List<ledgerSellerEntity> getAll() {

        QueryWrapper<ledgerSellerEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.select();
        return mysqlLedgerSellerDao.selectList(queryWrapper);
    }

    @Override
    public List<ledgerSellerEntity> getAll_id() {

        QueryWrapper<ledgerSellerEntity> queryWrapper = new QueryWrapper<>();
        queryWrapper.select("id");              // 查询结果的顺序不是固定的，它受数据库中数据的物理存储和查询执行计划的影响
        queryWrapper.orderByAsc("id");            // 升序排序
        return mysqlLedgerSellerDao.selectList(queryWrapper);
    }
}
