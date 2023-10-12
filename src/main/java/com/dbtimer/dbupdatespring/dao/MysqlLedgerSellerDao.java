package com.dbtimer.dbupdatespring.dao;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.dbtimer.dbupdatespring.entity.DMledgerSellerEntity;
import com.dbtimer.dbupdatespring.entity.ledgerSellerEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* @author swx
* @description 针对表【LedgerSeller】的数据库操作Mapper
* @createDate 2022-04-15 14:39:01
* @Entity com.dbtimer.dbupdatespring.entity.LedgerSeller
*/
@Mapper
@DS("mysql")
public interface MysqlLedgerSellerDao extends BaseMapper<ledgerSellerEntity> {


}




