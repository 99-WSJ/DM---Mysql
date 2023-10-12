package com.dbtimer.dbupdatespring.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 设备启动信息设置
 * @author swx
 * @TableName ledger_store_supplier
 */
@TableName(value ="ledger_store_supplier")
@Data
public class ledgerStoreSupplierEntity implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private Long id;

    @TableField(value = "store_id")
    private Long storeId;

    @TableField(value = "supplier_id")
    private Long supplierId;
    //供应商名称
    @TableField(value = "name")
    private String name;//冗余，尽量不用
    //负责人
    @TableField(value = "leader")
    private String leader;//冗余，尽量不用
    //负责人联系方式
    @TableField(value = "contact")
    private String contact;//冗余，尽量不用
    //地址
    @TableField(value = "address")
    private String address;//冗余，尽量不用

    @TableField(value = "sort_order")
    private Integer sortOrder;//冗余，尽量不用


}