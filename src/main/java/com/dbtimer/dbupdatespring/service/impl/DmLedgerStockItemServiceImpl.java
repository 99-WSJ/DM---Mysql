package com.dbtimer.dbupdatespring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dbtimer.dbupdatespring.dao.DmLedgerStockItemDao;
import com.dbtimer.dbupdatespring.entity.DMledgerStockItemEntity;
import com.dbtimer.dbupdatespring.service.DmLedgerStockItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("dmLedgerStockItemService")
public class DmLedgerStockItemServiceImpl extends ServiceImpl<DmLedgerStockItemDao, DMledgerStockItemEntity> implements DmLedgerStockItemService {

    @Autowired
    DmLedgerStockItemDao dmLedgerStockItemDao;

    @Override
    public List<DMledgerStockItemEntity> getAll() {

//        QueryWrapper<DMledgerStockItemEntity> queryWrapper = new QueryWrapper<>();
//        queryWrapper.select();
//        return dmLedgerStockItemDao.selectList(queryWrapper);
        return null;
    }
}
