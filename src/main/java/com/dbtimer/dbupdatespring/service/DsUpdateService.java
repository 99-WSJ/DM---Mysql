package com.dbtimer.dbupdatespring.service;



/**
 * @author swx
 * @Description 数据库10个表数据同步到系统数据库接口
 */
public interface DsUpdateService extends Runnable {
    void updateLedgerSellItem();
    void updateLedgerSeller();
    void updateLedgerStockItem();
    void updateLedgerSupplier();
    void updateLedgerStoreSupplier();
    void updateMerchantEmployee();
    void updateMerchantEmployeeLicense();
    void updateMerchantStore();
    void updateMerchantStoreBusinessLabel();
    void updateMerchantStoreLicense();


}
