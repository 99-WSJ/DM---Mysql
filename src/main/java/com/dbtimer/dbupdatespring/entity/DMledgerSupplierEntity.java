package com.dbtimer.dbupdatespring.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 最新数据
 * @author swx
 * @TableName ledger_supplier
 */
@TableName(value ="ledger_supplier")
@Data
public class DMledgerSupplierEntity implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private Long id;

    @TableField(value = "name")
    //供应商名称
    private String name;
    //编码
    @TableField(value = "code")
    private String code;
    //简称
    @TableField(value = "signage")
    private String signage;
    //负责人
    @TableField(value = "leader")
    private String leader;
    //负责人联系方式
    @TableField(value = "contact")
    private String contact;
    //地址
    @TableField(value = "address")
    private String address;

    @TableField(value = "refer_store_id")
    private Long referStoreId;
    @TableField(value = "refer_is_store")
    private Integer referIsStore;


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