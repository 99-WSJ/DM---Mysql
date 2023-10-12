package com.dbtimer.dbupdatespring.map;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @program: dbupdate_spring
 * @description: 存放达梦数据库RunConfig表的字段对应关系
 * @author: swx
 * @create: 2022-04-18 09:53
 **/
@Data
@Component
@ConfigurationProperties(prefix = "mysqltable.mysqlmerchantemployee")
public class MerchantEmployeeMap {

    private  Map<String, String> merchantEmployee;


}
