package com.dbtimer.dbupdatespring.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import lombok.Data;

/**
 * 与xml一致
 * @author 11092
 * @TableName OriginalData
 */
@TableName(value ="ledger_seller")
@Data
public class DMledgerSellerEntity implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
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