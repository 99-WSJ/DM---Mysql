package com.dbtimer.dbupdatespring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dbtimer.dbupdatespring.dao.*;
import com.dbtimer.dbupdatespring.entity.DMledgerSellItemEntity;
import com.dbtimer.dbupdatespring.service.DmLedgerSellItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dmLedgerSellItemService")
public class DmLedgerSellItemServiceImpl extends ServiceImpl<DmLedgerSellItemDao, DMledgerSellItemEntity> implements DmLedgerSellItemService {

    @Autowired
    DmLedgerSellItemDao LedgerSellItemDao;

    /**
     * @Author swx
     * @Description //取出达梦数据库ledgerSellItem表中所有数据
     * @Date 23:35 2022/4/17
     * @Param []
     * @Return java.util.List<com.dbtimer.dbupdatespring.entity.ledgerSellItemEntity>
     */
    @Override
    public List<DMledgerSellItemEntity> getAll(){
//        QueryWrapper<DMledgerSellItemEntity> queryWrapper = new QueryWrapper<>();
//        queryWrapper.select();
//        return LedgerSellItemDao.selectList(queryWrapper);
        return null;
    }
}
