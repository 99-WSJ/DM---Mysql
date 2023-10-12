package com.dbtimer.dbupdatespring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dbtimer.dbupdatespring.dao.DmLedgerSupplierDao;
import com.dbtimer.dbupdatespring.entity.DMledgerSupplierEntity;
import com.dbtimer.dbupdatespring.service.DmLedgerSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("dmLedgerSupplierService")
public class DmLedgerSupplierServiceImpl extends ServiceImpl<DmLedgerSupplierDao, DMledgerSupplierEntity> implements DmLedgerSupplierService {

    @Autowired
    DmLedgerSupplierDao dmLedgerSupplierDao;

    @Override
    public List<DMledgerSupplierEntity> getAll() {
//        QueryWrapper<DMledgerSupplierEntity> queryWrapper = new QueryWrapper<>();
//        queryWrapper.select();
//        return dmLedgerSupplierDao.selectList(queryWrapper);
        return null;
    }
}
