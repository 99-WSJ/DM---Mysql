package com.dbtimer.dbupdatespring.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * 指令下发
 * @author swx
 * @TableName merchant_employee
 */
@TableName(value ="merchant_employee")
@Data
public class DMmerchantEmployeeEntity implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private Long id;
    @TableField(value = "store_id")
    private Long storeId;
    @TableField(value = "user_id")

    private Long userId;
    @TableField(value = "position_code")

    private Integer positionCode;
    @TableField(value = "is_choose")

    private Integer isChoose;
    @TableField(value = "is_admin")

    private Integer isAdmin;
    @TableField(value = "empno")

    private String empno;
    @TableField(value = "name")

    private String name;
    @TableField(value = "mobile")

    private String mobile;
    @TableField(value = "perm_value")
    //员工拥有权限值
    private Integer permValue;


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
    @TableField(value = "update_time_covid")
    private Date updateTimeCovid;
    @TableField(value = "last_time_covid")
    private Long lastTimeCovid;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}