package com.dbtimer.dbupdatespring.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 站点基本属性表请参考标准库（本表没有字段注释！）
 * @author swx
 * @TableName merchant_employee_license
 */
@TableName(value ="merchant_employee_license")
@Data
public class merchantEmployLicenseEntity implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private String id;


    @TableField(value = "store_id")
    private Long storeId;

    @TableField(value = "employee_id")
    private Long employeeId;
    @TableField(value = "user_id")

    private Long userId;

    //健康证编码
    @TableField(value = "health_code")
    private String healthCode;

    //健康证到期时间
    @TableField(value = "health_expiration_time")
    private Date healthExpirationTime;

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