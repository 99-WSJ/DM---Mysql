package com.dbtimer.dbupdatespring.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 测点信息管理--该表存放测点的一些重要信息
 * @author swx
 * @TableName merchant_store_license
 */
@TableName(value ="merchant_store_license")
@Data
public class merchantStoreLicenseEntity implements Serializable {
    /**
     * 唯一标识
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 测点编号
     */
    @TableField(value = "store_id")
    //外键id
    private Long storeId;

    //工商营业执照编码
    @TableField(value = "commerce_code")
    private String commerceCode;
    //工商营业执照名称
    @TableField(value = "commerce_name")
    private String commerceName;
    //工商营业执照到期时间
    @TableField(value = "commerce_expiration_time")
    private Date commerceExpirationTime;
    @TableField(value = "commerce_is_unlimited")
    private Integer commerceIsUnlimited;


    //食品经营许可证编码
    @TableField(value = "food_business_code")
    private String foodBusinessCode;

    //食品经营许可证到期时间
    @TableField(value = "food_business_expiration_time")
    private Date foodBusinessExpirationTime;
    @TableField(value = "food_business_is_unlimited")
    private Integer foodBusinessIsUnlimited;

    @TableField(value = "description")
    private String description;
    @TableField(value = "sort_order")
    private Integer sortOrder;
    @TableField(value = "create_time")
    private Date createTime;
    @TableField(value = "create_id")
    private Long createId;
    @TableField(value = "update_time")
    private Date updateTime;
    @TableField(value = "update_id")
    private Long updateId;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}

