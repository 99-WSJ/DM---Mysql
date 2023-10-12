package com.dbtimer.dbupdatespring.map;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @program: dbupdate_spring
 * @description: 存放达梦数据库StstbprpB表的字段对应关系
 * @author: swx
 * @create: 2022-04-18 09:55
 **/
@Data
@Component
@ConfigurationProperties(prefix = "mysqltable.mysqlmerchantstorebusinesslabel")
public class MerchantStoreBusinessLabelMap {

    private  Map<String, String> merchantStoreBusinessLabel;

}
