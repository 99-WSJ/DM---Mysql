package com.dbtimer.dbupdatespring.map;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @program: dbupdate_spring
 * @description: 存放达梦数据库BaseConfig表的字段对应关系
 * @author: swx
 * @create: 2022-04-18 09:45
 **/

@Data
@Component
@ConfigurationProperties(prefix = "mysqltable.mysqlledgerseller")
public class LedgerSellerMap {

    /**
     * 存放该表与系统数据库pointInfoImportant的字段对应关系
     */
    private  Map<String, String> ledgerSeller;


}
