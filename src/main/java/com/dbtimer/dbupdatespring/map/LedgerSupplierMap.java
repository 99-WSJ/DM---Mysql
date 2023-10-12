package com.dbtimer.dbupdatespring.map;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @program: dbupdate_spring
 * @description: originaldata表对应关系
 * @author: swx
 * @create: 2022-04-14 16:49
 **/
@Data
@Component
@ConfigurationProperties(prefix = "mysqltable.mysqlledgersupplier")
public class LedgerSupplierMap {

    private  Map<String, String> ledgerSupplier;

}
