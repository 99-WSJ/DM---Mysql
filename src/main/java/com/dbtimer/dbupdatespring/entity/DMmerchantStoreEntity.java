package com.dbtimer.dbupdatespring.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 与xml一致
 * @author swx
 * @TableName merchant_store
 */
@TableName(value ="merchant_store")
@Data
public class DMmerchantStoreEntity implements Serializable {
    /**
     *
     */
    @TableId(value = "id")
    private Long id;
    @TableField(value = "user_id")
    private Long userId;

    @TableField(value = "region_id")
    private Long regionId;
    @TableField(value = "region_name")
    private String regionName;

    @TableField(value = "parent_id")
    private Long parentId;

    @TableField(value = "type")
    private Integer type;

    @TableField(value = "business_type")
    private Integer businessType;
    //编码
    @TableField(value = "code")
    private String code;
    //名称
    @TableField(value = "name")
    private String name;
    //简称（用于市场命名用）
    @TableField(value = "signage")
    private String signage;
    //联系方式
    @TableField(value = "contact")
    private String contact;



    //商铺等级
    @TableField(value = "store_lv")
    private int storeLV;

    @TableField(value = "is_child")
    private Integer isChild;

    @TableField(value = "is_active")
    private Integer isActive ;
    //编号
    @TableField(value = "child_num")
    private String childNum;

    @TableField(value = "longitude")
    private String longitude;
    @TableField(value = "latitude")
    private String latitude;
    @TableField(value = "address")
    private String address;
    @TableField(value = "is_stop")
    private Integer isStop;

    @TableField(value = "user_position")
    private String userPosition;
    @TableField(value = "demand_resource")
    private String demandResource;
    @TableField(value = "main_business")
    private String mainBusiness;
    @TableField(value = "active_time")
    private Date activeTime;

    @TableField(value = "description")
    private String description;
    @TableField(value = "sort_order")
    private Integer sortOrder;
    @TableField(value = "is_lock")
    private Integer isLock;
    @TableField(value = "is_delete")
    private Integer isDelete;
    @TableField(value = "is_show")
    private Integer isShow;
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