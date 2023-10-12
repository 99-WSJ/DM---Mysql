package com.dbtimer.dbupdatespring.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 设备基础属性表
 * @author swx
 * @TableName ledger_sell_item
 */
@TableName(value ="ledger_sell_item")
@Data
public class ledgerSellItemEntity implements Serializable {

    /**
     * 主键
     */

    @TableId(value = "id")
    private Long id;

    /**
     * 门店id
     */
    @TableField(value = "store_id")
    private Long storeId;

    /**
     * 记录时间
     */
    @TableField(value = "record_time")
    private Date recordTime;

    /**
     * 进货id
     */
    @TableField(value = "stock_item_id")
    private Long stockItemId;

    /**
     * 要测站地址
     */
    @TableField(value = "seller_id")
    private Long sellerId;

    /**
     * 购货者
     */
    @TableField(value = "seller_name")
    private String sellerName;

    // 商品名称
    @TableField(value = "goods_name")
    private String goodsName;

    /**
     * 商品规格
     */
    @TableField(value = "spec")
    private String spec;

    /**
     * 商品数量
     */
    @TableField(value = "number")
    private BigDecimal number;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;


}