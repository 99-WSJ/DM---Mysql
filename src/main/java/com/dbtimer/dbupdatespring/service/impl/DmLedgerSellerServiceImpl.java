package com.dbtimer.dbupdatespring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dbtimer.dbupdatespring.dao.DmLedgerSellerDao;
import com.dbtimer.dbupdatespring.entity.DMledgerSellerEntity;
import com.dbtimer.dbupdatespring.service.DmLedgerSellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("dmLedgerSellService")
public class DmLedgerSellerServiceImpl extends ServiceImpl<DmLedgerSellerDao, DMledgerSellerEntity> implements DmLedgerSellerService {


    @Autowired
    DmLedgerSellerDao dmLedgerSellerDao;
    @Override
    public List<DMledgerSellerEntity> getAll() {

//        QueryWrapper<DMledgerSellerEntity> queryWrapper = new QueryWrapper<>();
//        queryWrapper.select();
//        return dmLedgerSellerDao.selectList(queryWrapper);
        return null;
    }
}
