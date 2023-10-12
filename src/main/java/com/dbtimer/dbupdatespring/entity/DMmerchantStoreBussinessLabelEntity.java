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
 * @author 11092
 * @TableName data_points_original
 */
@TableName(value ="merchant_store_business_label")
@Data
public class DMmerchantStoreBussinessLabelEntity implements Serializable {
    /**
     * 主键
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 测点编号
     */
    @TableField(value = "store_id")
    private Long storeId;

    /**
     * 观测时间
     */
    @TableField(value = "business_label")
    private Integer businessLabel;


    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        return false;
    }
}
