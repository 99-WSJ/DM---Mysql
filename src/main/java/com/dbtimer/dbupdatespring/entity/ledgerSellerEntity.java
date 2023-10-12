package com.dbtimer.dbupdatespring.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import lombok.Data;

/**
 * 历史数据
 * @author 11092
 * @TableName ledger_seller
 */
@TableName(value ="ledger_seller")
@Data
public class ledgerSellerEntity implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "ID")
    private Long id;

    /**
     * 商店id
     */
    @TableField(value = "store_id")
    private Long storeId;

    /**
     * 名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 联系方式
     */
    @TableField(value = "contact")
    private String contact;

    /**
     * 地址
     */
    @TableField(value = "address")
    private String address;




}