package com.dbtimer.dbupdatespring.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * gprs报文
 * @author swx
 * @TableName ledger_stock_item
 */
@TableName(value ="ledger_stock_item")
@Data
public class ledgerStockItemEntity implements Serializable {
    /**
     * 主键
     */


    @TableId(value = "id")
    private Long id;
    //商户id

    @TableField(value = "store_id")
    private Long storeId;

    @TableField(value = "stock_time")
    private Date stockTime;
    //商品名称
    @TableField(value = "goods_name")
    private String goodsName;
    //商品规格
    @TableField(value = "spec")
    private String spec;
    //商品数量
    @TableField(value = "number")
    private BigDecimal number;
    //价格
    @TableField(value = "price")
    private BigDecimal price;
    //车牌号
    @TableField(value = "car_num")
    private String carNum;
    //供应商
    @TableField(value = "store_supplier_id")

    private Long storeSupplierId;
    //供应商名称(冗余)
    @TableField(value = "store_supplier_name")
    private String storeSupplierName;
    //对应的采购品
    @TableField(value = "purchase_type")
    private Integer purchaseType;
    @TableField(value = "product_time")

    private Date productTime;//生产日期
    @TableField(value = "quality_number")
    private BigDecimal qualityNumber;
    @TableField(value = "quality_unit")
    private Integer qualityUnit;
    //是否是商城采购的，参考YesOrNot
    @TableField(value = "is_purchase")
    private Integer isPurchase;

    //检测价格
    @TableField(value = "check_price")
    private BigDecimal checkPrice;
    //检测状态：-1(检测不合格)、0（未检测）、1（检测合格）
    @TableField(value = "description")
    private String description;
    @TableField(value = "sort_order")
    private Integer sortOrder;
    @TableField(value = "check_status")
    private Integer checkStatus;
    @TableField(value = "is_delete")
    private Integer isDelete;
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