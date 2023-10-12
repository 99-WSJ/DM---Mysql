package com.dbtimer.dbupdatespring.map;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @program: dbupdate_spring
 * @description: 达梦数据库LastData表的字段对应关系
 * @author: swx
 * @create: 2022-04-14 11:22
 **/
@Data
@Component
@ConfigurationProperties (prefix = "mysqltable.mysqlledgerstockitem")
public class LedgerStockItemMap {

    /**
     * 存放该表与系统数据库dataPoints的字段对应关系
     */
    private  Map<String, String> ledgerStockItem;

}
