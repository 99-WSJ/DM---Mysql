package com.dbtimer.dbupdatespring.map;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @program: dbupdate_spring
 * @description: 存放达梦数据库OriginalMsgGprs表的字段对应关系
 * @author: swx
 * @create: 2022-04-18 09:51
 **/
@Data
@Component
@ConfigurationProperties(prefix = "mysqltable.mysqlledgerstoresupplier")
public class LedgerStoreSupplierMap {

    private  Map<String, String> ledgerStoreSupplier;

}
