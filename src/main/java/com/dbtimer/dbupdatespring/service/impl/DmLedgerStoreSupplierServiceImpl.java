package com.dbtimer.dbupdatespring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dbtimer.dbupdatespring.dao.DmLedgerStoreSupplierDao;
import com.dbtimer.dbupdatespring.entity.DMledgerStoreSupplierEntity;
import com.dbtimer.dbupdatespring.service.DmLedgerStoreSupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("dmLedgerStoreSupplierService")
public class DmLedgerStoreSupplierServiceImpl extends ServiceImpl<DmLedgerStoreSupplierDao, DMledgerStoreSupplierEntity> implements DmLedgerStoreSupplierService {


    @Autowired
    DmLedgerStoreSupplierDao dmLedgerStoreSupplierDao;

    @Override
    public List<DMledgerStoreSupplierEntity> getAll() {
//        QueryWrapper<DMledgerStoreSupplierEntity> queryWrapper = new QueryWrapper<>();
//        queryWrapper.select();
//        return dmLedgerStoreSupplierDao.selectList(queryWrapper);

        return null;
    }
}
