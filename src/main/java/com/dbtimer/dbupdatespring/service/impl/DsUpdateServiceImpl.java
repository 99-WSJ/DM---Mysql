package com.dbtimer.dbupdatespring.service.impl;

import com.baomidou.mybatisplus.core.assist.ISqlRunner;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dbtimer.dbupdatespring.dao.*;
import com.dbtimer.dbupdatespring.entity.*;
import com.dbtimer.dbupdatespring.map.*;
import com.dbtimer.dbupdatespring.service.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.beans.BeanMap;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


@Service("dsupdateService")
@Data
@SuppressWarnings("unchecked")
public class DsUpdateServiceImpl implements DsUpdateService {

    @Autowired
    DmLedgerSellerDao dmLedgerSellerDao;
    @Autowired
    MysqlLedgerSellerDao LedgerSellerDao;
    @Autowired
    DmLedgerSellItemDao dmLedgerSellItemDao;
    @Autowired
    MysqlLedgerSellItemDao LedgerSellItemDao;
    @Autowired
    DmLedgerStockItemDao dmLedgerStockItemDao;
    @Autowired
    MysqlLedgerStockItemDao LedgerStockItemDao;
    @Autowired
    DmLedgerStoreSupplierDao dmLedgerStoreSupplierDao;
    @Autowired
    MysqlLedgerStoreSupplierDao LedgerStoreSupplierDao;
    @Autowired
    DmLedgerSupplierDao dmLedgerSupplierDao;
    @Autowired
    MysqlLedgerSupplierDao LedgerSupplierDao;
    @Autowired
    DmMerchantEmployeeDao dmMerchantEmployeeDao;
    @Autowired
    MysqlMerchantEmployeeDao MerchantEmployeeDao;
    @Autowired
    DmMerchantEmployLicenseDao dmMerchantEmployLicenseDao;
    @Autowired
    MysqlMerchantEmployLicenseDao MerchantEmployLicenseDao;
    @Autowired
    DmMerchantStoreBussinessLabelDao dmMerchantStoreBussinessLabelDao;
    @Autowired
    MysqlMerchantStoreBussinessLabelDao MerchantStoreBussinessLabelDao;
    @Autowired
    DmMerchantStoreDao dmMerchantStoreDao;
    @Autowired
    MysqlMerchantStoreDao MerchantStoreDao;
    @Autowired
    DmMerchantStoreLicenseDao dmMerchantStoreLicenseDao;
    @Autowired
    MysqlMerchantStoreLicenseDao MerchantStoreLicenseDao;


    @Autowired
    LedgerSellItemService ledgerSellItemService;
    @Autowired
    LedgerSellerService ledgerSellerService;
    @Autowired
    LedgerStockItemService ledgerStockItemService;
    @Autowired
    LedgerStoreSupplierService ledgerStoreSupplierService;
    @Autowired
    LedgerSupplierService ledgerSupplierService;
    @Autowired
    MerchantEmployeeService merchantEmployeeService;
    @Autowired
    MerchantEmployLicenseService merchantEmployLicenseService;
    @Autowired
    MerchantStoreBussinessLabelService merchantStoreBussinessLabelService;
    @Autowired
    MerchantStoreLicenseService merchantStoreLicenseService;
    @Autowired
    MerchantStoreService merchantStoreService;

    @Autowired
    private LedgerSellerMap ledgerSellerMap;
    @Autowired
    private LedgerSellItemMap ledgerSellItemMap;
    @Autowired
    private LedgerStockItemMap ledgerStockItemMap;
    @Autowired
    private LedgerStoreSupplierMap ledgerStoreSupplierMap;
    @Autowired
    private LedgerSupplierMap ledgerSupplierMap;
    @Autowired
    private MerchantEmployeeLicenseMap merchantEmployeeLicenseMap;
    @Autowired
    private MerchantEmployeeMap merchantEmployeeMap;
    @Autowired
    private MerchantStoreBusinessLabelMap merchantStoreBusinessLabelMap;
    @Autowired
    private MerchantStoreLicenseMap merchantStoreLicenseMap;
    @Autowired
    private MerchantStoreMap merchantStoreMap;

    @Override
    public void updateLedgerSellItem()  {
        BeanMap mysqlTableColMap = BeanMap.create(ledgerSellItemMap);
        System.out.println("---开始同步ledgerSellItem表---");
        //dmTableName表示DMSQL表名
        for (Object dmTableName : mysqlTableColMap.keySet()) {
            System.out.println("本次数据同步对应的DMSQL表名： ");
            System.out.println(dmTableName);
            System.out.println("字段对应关系为： ");
            //colMap储存字段对应关系
            Map<String, String> colMap = (Map<String, String>) mysqlTableColMap.get(dmTableName);
            System.out.println(colMap);
            if(colMap==null){
                continue;
            }
            //ledgerSellItemEntityList
//            List<ledgerSellItemEntity> ledgerSellItemEntityList = ledgerSellItemService.getAll();
            List<ledgerSellItemEntity> ledgerSellItemEntityList = ledgerSellItemService.getAll_id();
            System.out.println(ledgerSellItemEntityList.get(0));
            //mysql数据表中 colNum表示一共多少条记录
            int colNum = ledgerSellItemEntityList.size();
            System.out.println("mysql数据表中colNum= "+colNum);
            switch (dmTableName.toString()) {
                case "ledgerSellItem":
                    //取出MySQL数据表数据ledgerSellItemEntityList
                    QueryWrapper<DMledgerSellItemEntity> queryWrapper1 = new QueryWrapper<>();
//                    queryWrapper1.select("id");
                    // mysql里面ledgerSellItem表的数据
//                    List<DMledgerSellItemEntity> dMledgerSellItemEntityList = dmLedgerSellItemDao.selectList(queryWrapper1);
//                    System.out.println(dMledgerSellItemEntityList.get(0));
                    int dmCol = dmLedgerSellItemDao.selectCount(queryWrapper1);
                    System.out.printf("DM对应表中现有%d条, 还需要导入%d条\n", dmCol,colNum-dmCol);
                    //对每条记录进行相应赋值操作
                    for (int i = dmCol; i < colNum; i++) {
                        //根据每个id索引获取该条全部信息，进行赋值
                        QueryWrapper<ledgerSellItemEntity> queryWrapper2 = new QueryWrapper<>();
                        queryWrapper2.eq("id", ledgerSellItemEntityList.get(i).getId());
                        // mysql里面ledgerSellItem表的数据

                        ledgerSellItemEntity sigle_ledgerSellItemEntity = LedgerSellItemDao.selectOne(queryWrapper2);
                        dmLedgerSellItemDao.insert(sigle_ledgerSellItemEntity);
                        System.out.println("已插入第 "+(i+1)+" 行，id为： "+sigle_ledgerSellItemEntity.getId());
                    }
                    break;
                default:
                    System.out.println("没有配置相关表的对应关系");
            }


        }
    }

    @Override
    public void updateLedgerSeller() {
        BeanMap mysqlTableColMap = BeanMap.create(ledgerSellerMap);
        System.out.println("---开始同步ledgerSeller表---");
        //dmTableName表示DMSQL表名
        for (Object dmTableName : mysqlTableColMap.keySet()) {
            System.out.println("本次数据同步对应的DMSQL表名： ");
            System.out.println(dmTableName);
            System.out.println("字段对应关系为： ");
            //colMap储存字段对应关系
            Map<String, String> colMap = (Map<String, String>) mysqlTableColMap.get(dmTableName);
            System.out.println(colMap);
            if(colMap==null){
                continue;
            }
            //dMledgerSellerEntityList
//            List<ledgerSellerEntity> ledgerSellerEntityList = ledgerSellerService.getAll();
            List<ledgerSellerEntity> ledgerSellerEntityList = ledgerSellerService.getAll_id();
            //colNum表示一共多少条记录
            int colNum = ledgerSellerEntityList.size();
            System.out.println("mysql数据表中colNum= "+colNum);
            switch (dmTableName.toString()) {
                case "ledgerSeller":
                    //取出MySQL数据表数据ledgerSellerEntityList
                    QueryWrapper<DMledgerSellerEntity> queryWrapper1 = new QueryWrapper<>();
//                    queryWrapper1.select("id");
                    // mysql里面ledgerSeller表的数据
//                    List<DMledgerSellerEntity> dMledgerSellerEntityList = dmLedgerSellerDao.selectList(queryWrapper1);
                    int dmCol = dmLedgerSellerDao.selectCount(queryWrapper1);
                    System.out.printf("DM对应表中现有%d条, 还需要导入%d条\n", dmCol,colNum-dmCol);
                    //对每条记录进行相应赋值操作
                    for (int i = dmCol; i < colNum; i++) {
                        //根据每个id索引获取该条全部信息，进行赋值
                        QueryWrapper<ledgerSellerEntity> queryWrapper2 = new QueryWrapper<>();
                        queryWrapper2.eq("id", ledgerSellerEntityList.get(i).getId());
                        // mysql里面ledgerSellItem表的数据

                        ledgerSellerEntity sigle_ledgerSellerEntity = LedgerSellerDao.selectOne(queryWrapper2);
                        dmLedgerSellerDao.insert(sigle_ledgerSellerEntity);
                        System.out.println("已插入第 "+(i+1)+" 行，id为： "+sigle_ledgerSellerEntity.getId());

                    }
                    break;

                default:
                    System.out.println("没有配置相关表的对应关系");
            }

        }
    }

    @Override
    public void updateLedgerStockItem() {
        BeanMap mysqlTableColMap = BeanMap.create(ledgerStockItemMap);
        System.out.println("---开始同步ledgerStockItem表---");
        //dmTableName表示DMSQL表名
        for (Object dmTableName : mysqlTableColMap.keySet()) {
            System.out.println("本次数据同步对应的DMSQL表名： ");
            System.out.println(dmTableName);
            System.out.println("字段对应关系为： ");
            //colMap储存字段对应关系
            Map<String, String> colMap = (Map<String, String>) mysqlTableColMap.get(dmTableName);
            System.out.println(colMap);
            if(colMap==null){
                continue;
            }
            //mysqlledgerStockItemEntityList
            List<ledgerStockItemEntity> ledgerStockItemEntityList = ledgerStockItemService.getAll_id();
            //colNum表示一共多少条记录
            int colNum = ledgerStockItemEntityList.size();
            System.out.println("mysql数据表中colNum= "+colNum);
            switch (dmTableName.toString()) {
                case "ledgerStockItem":
                    QueryWrapper<DMledgerStockItemEntity> queryWrapper1 = new QueryWrapper<>();
//                    queryWrapper1.select("id");
//                    List<DMledgerStockItemEntity> dMledgerStockItemEntityList = dmLedgerStockItemDao.selectList(queryWrapper1);
                    int dmCol = dmLedgerStockItemDao.selectCount(queryWrapper1);
                    System.out.printf("DM对应表中现有%d条, 还需要导入%d条\n", dmCol,colNum-dmCol);
                    //对每条记录进行相应赋值操作
                    for (int i = dmCol; i < colNum; i++) {
                        QueryWrapper<ledgerStockItemEntity> queryWrapper2 = new QueryWrapper<>();
                        queryWrapper2.eq("id", ledgerStockItemEntityList.get(i).getId());
                        // mysql里面ledgerSellItem表的数据

                        ledgerStockItemEntity sigle_ledgerStockItemEntity = LedgerStockItemDao.selectOne(queryWrapper2);
                        dmLedgerStockItemDao.insert(sigle_ledgerStockItemEntity);
                        System.out.println("已插入第 "+(i+1)+" 行，id为： "+sigle_ledgerStockItemEntity.getId());

                    }
                    break;

                default:
                    System.out.println("没有配置相关表的对应关系");
            }

        }
    }

    @Override
    public void updateLedgerSupplier() {
        BeanMap mysqlTableColMap = BeanMap.create(ledgerSupplierMap);
        System.out.println("---开始同步ledgerSupplier表---");
        //dmTableName表示DMSQL表名
        for (Object dmTableName : mysqlTableColMap.keySet()) {
            System.out.println("本次数据同步对应的DMSQL表名： ");
            System.out.println(dmTableName);
            System.out.println("字段对应关系为： ");
            //colMap储存字段对应关系
            Map<String, String> colMap = (Map<String, String>) mysqlTableColMap.get(dmTableName);
            System.out.println(colMap);
            if(colMap==null){
                continue;
            }
            //dMledgerSupplierEntityList
            List<ledgerSupplierEntity> ledgerSupplierEntityList = ledgerSupplierService.getAll_id();
            //colNum表示一共多少条记录
            int colNum = ledgerSupplierEntityList.size();
            System.out.println("mysql数据表中colNum= "+colNum);
            switch (dmTableName.toString()) {
                case "ledgerSupplier":
                    //取出MySQL数据表数据ledgerSupplierEntityList
                    QueryWrapper<DMledgerSupplierEntity> queryWrapper1 = new QueryWrapper<>();
//                    queryWrapper1.select("id");
                    // mysql里面ledgerSupplier表的数据
//                    List<DMledgerSupplierEntity> dMledgerSupplierEntityList = dmLedgerSupplierDao.selectList(queryWrapper1);
                    int dmCol = dmLedgerSupplierDao.selectCount(queryWrapper1);
                    System.out.printf("DM对应表中现有%d条, 还需要导入%d条\n", dmCol,colNum-dmCol);
                    //对每条记录进行相应赋值操作
                    for (int i = dmCol; i < colNum; i++) {
                        //根据每个id索引获取该条全部信息，进行赋值
                        QueryWrapper<ledgerSupplierEntity> queryWrapper2 = new QueryWrapper<>();
                        queryWrapper2.eq("id", ledgerSupplierEntityList.get(i).getId());
                        // mysql里面ledgerSellItem表的数据

                        ledgerSupplierEntity sigle_ledgerSupplierEntity = LedgerSupplierDao.selectOne(queryWrapper2);
                        dmLedgerSupplierDao.insert(sigle_ledgerSupplierEntity);
                        System.out.println("已插入第 "+(i+1)+" 行，id为： "+sigle_ledgerSupplierEntity.getId());
                    }
                    break;

                default:
                    System.out.println("没有配置相关表的对应关系");
            }

        }
    }

    @Override
    public void updateLedgerStoreSupplier() {
        BeanMap mysqlTableColMap = BeanMap.create(ledgerStoreSupplierMap);
        System.out.println("---开始同步ledgerStoreSupplier表---");
        //dmTableName表示DMSQL表名
        for (Object dmTableName : mysqlTableColMap.keySet()) {
            System.out.println("本次数据同步对应的DMSQL表名： ");
            System.out.println(dmTableName);
            System.out.println("字段对应关系为： ");
            //colMap储存字段对应关系
            Map<String, String> colMap = (Map<String, String>) mysqlTableColMap.get(dmTableName);
            System.out.println(colMap);
            if(colMap==null){
                continue;
            }
            //dMledgerStoreSupplierEntityList
            List<ledgerStoreSupplierEntity> ledgerStoreSupplierEntityList = ledgerStoreSupplierService.getAll_id();
            //colNum表示一共多少条记录
            int colNum = ledgerStoreSupplierEntityList.size();
            System.out.println("mysql数据表中colNum= "+colNum);
            switch (dmTableName.toString()) {
                case "ledgerStoreSupplier":
                    //取出MySQL数据表数据ledgerStoreSupplierEntityList
                    QueryWrapper<DMledgerStoreSupplierEntity> queryWrapper1 = new QueryWrapper<>();
//                    queryWrapper1.select("id");
                    // mysql里面ledgerStoreSupplier表的数据
//                    List<DMledgerStoreSupplierEntity> dMledgerStoreSupplierEntityList = dmLedgerStoreSupplierDao.selectList(queryWrapper1);
                    int dmCol = dmLedgerStoreSupplierDao.selectCount(queryWrapper1);
                    System.out.printf("DM对应表中现有%d条, 还需要导入%d条\n", dmCol,colNum-dmCol);
                    //对每条记录进行相应赋值操作
                    for (int i = dmCol; i < colNum; i++) {
                        //根据每个id索引获取该条全部信息，进行赋值
                        QueryWrapper<ledgerStoreSupplierEntity> queryWrapper2 = new QueryWrapper<>();
                        queryWrapper2.eq("id", ledgerStoreSupplierEntityList.get(i).getId());
                        // mysql里面ledgerSellItem表的数据

                        ledgerStoreSupplierEntity sigle_ledgerStoreSupplierEntity = LedgerStoreSupplierDao.selectOne(queryWrapper2);
                        dmLedgerStoreSupplierDao.insert(sigle_ledgerStoreSupplierEntity);
                        System.out.println("已插入第 "+(i+1)+" 行，id为： "+sigle_ledgerStoreSupplierEntity.getId());
                    }
                    break;

                default:
                    System.out.println("没有配置相关表的对应关系");
            }

        }
    }

    @Override
    public void updateMerchantEmployee() {
        BeanMap mysqlTableColMap = BeanMap.create(merchantEmployeeMap);
        System.out.println("---开始同步merchantEmployee表---");
        //dmTableName表示DMSQL表名
        for (Object dmTableName : mysqlTableColMap.keySet()) {
            System.out.println("本次数据同步对应的DMSQL表名： ");
            System.out.println(dmTableName);
            System.out.println("字段对应关系为： ");
            //colMap储存字段对应关系
            Map<String, String> colMap = (Map<String, String>) mysqlTableColMap.get(dmTableName);
            System.out.println(colMap);
            if(colMap==null){
                continue;
            }
            //dMMerchantEmployeeEntityList
            List<merchantEmployeeEntity> merchantEmployeeEntityList = merchantEmployeeService.getAll_id();
            //colNum表示一共多少条记录
            int colNum = merchantEmployeeEntityList.size();
            System.out.println("mysql数据表中colNum= "+colNum);
            switch (dmTableName.toString()) {
                case "merchantEmployee":
                    //取出MySQL数据表数据MerchantEmployeeEntityList
                    QueryWrapper<DMmerchantEmployeeEntity> queryWrapper1 = new QueryWrapper<>();
//                    queryWrapper1.select("id");
                    // mysql里面MerchantEmployee表的数据
//                    List<DMmerchantEmployeeEntity> dMMerchantEmployeeEntityList = dmMerchantEmployeeDao.selectList(queryWrapper1);
                    int dmCol = dmMerchantEmployeeDao.selectCount(queryWrapper1);
                    System.out.printf("DM对应表中现有%d条, 还需要导入%d条\n", dmCol,colNum-dmCol);
                    //对每条记录进行相应赋值操作
                    for (int i = dmCol; i < colNum; i++) {
                        //根据每个id索引获取该条全部信息，进行赋值
                        QueryWrapper<merchantEmployeeEntity> queryWrapper2 = new QueryWrapper<>();
                        queryWrapper2.eq("id", merchantEmployeeEntityList.get(i).getId());
                        // mysql里面ledgerSellItem表的数据

                        merchantEmployeeEntity sigle_merchantEmployeeEntity = MerchantEmployeeDao.selectOne(queryWrapper2);
                        dmMerchantEmployeeDao.insert(sigle_merchantEmployeeEntity);
                        System.out.println("已插入第 "+(i+1)+" 行，id为： "+sigle_merchantEmployeeEntity.getId());

                    }
                    break;

                default:
                    System.out.println("没有配置相关表的对应关系");
            }

        }
    }

    @Override
    public void updateMerchantEmployeeLicense() {
        BeanMap mysqlTableColMap = BeanMap.create(merchantEmployeeLicenseMap);
        System.out.println("---开始同步merchantEmployeeLicense表---");
        //dmTableName表示DMSQL表名
        for (Object dmTableName : mysqlTableColMap.keySet()) {
            System.out.println("本次数据同步对应的DMSQL表名： ");
            System.out.println(dmTableName);
            System.out.println("字段对应关系为： ");
            //colMap储存字段对应关系
            Map<String, String> colMap = (Map<String, String>) mysqlTableColMap.get(dmTableName);
            System.out.println(colMap);
            if(colMap==null){
                continue;
            }
            //dMMerchantEmployeeLicenseEntityList
            List<merchantEmployLicenseEntity> merchantEmployeeLicenseEntityList = merchantEmployLicenseService.getAll_id();
            //colNum表示一共多少条记录
            int colNum = merchantEmployeeLicenseEntityList.size();
            System.out.println("mysql数据表中colNum= "+colNum);
            switch (dmTableName.toString()) {
                case "merchantEmployeeLicense":
                    //取出MySQL数据表数据MerchantEmployeeLicenseEntityList
                    QueryWrapper<DMmerchantEmployLicenseEntity> queryWrapper1 = new QueryWrapper<>();
//                    queryWrapper1.select("id");
                    // mysql里面MerchantEmployeeLicense表的数据
//                    List<DMmerchantEmployLicenseEntity> dMMerchantEmployeeLicenseEntityList = dmMerchantEmployLicenseDao.selectList(queryWrapper1);
                    int dmCol = dmMerchantEmployLicenseDao.selectCount(queryWrapper1);
                    System.out.printf("DM对应表中现有%d条, 还需要导入%d条\n", dmCol,colNum-dmCol);
                    //对每条记录进行相应赋值操作
                    for (int i = dmCol; i < colNum; i++) {
                        //根据每个id索引获取该条全部信息，进行赋值
                        QueryWrapper<merchantEmployLicenseEntity> queryWrapper2 = new QueryWrapper<>();
                        queryWrapper2.eq("id", merchantEmployeeLicenseEntityList.get(i).getId());
                        // mysql里面ledgerSellItem表的数据

                        merchantEmployLicenseEntity sigle_merchantEmployLicenseEntity = MerchantEmployLicenseDao.selectOne(queryWrapper2);
                        dmMerchantEmployLicenseDao.insert(sigle_merchantEmployLicenseEntity);
                        System.out.println("已插入第 "+(i+1)+" 行，id为： "+sigle_merchantEmployLicenseEntity.getId());
                    }
                    break;

                default:
                    System.out.println("没有配置相关表的对应关系");
            }

        }
    }

    @Override
    public void updateMerchantStore() {
        BeanMap mysqlTableColMap = BeanMap.create(merchantStoreMap);
        System.out.println("---开始同步merchantStore表---");
        //dmTableName表示DMSQL表名
        for (Object dmTableName : mysqlTableColMap.keySet()) {
            System.out.println("本次数据同步对应的DMSQL表名： ");
            System.out.println(dmTableName);
            System.out.println("字段对应关系为： ");
            //colMap储存字段对应关系
            Map<String, String> colMap = (Map<String, String>) mysqlTableColMap.get(dmTableName);
            System.out.println(colMap);
            if(colMap==null){
                continue;
            }
            //dMMerchantStoreEntityList
            List<merchantStoreEntity> merchantStoreEntityList = merchantStoreService.getAll_id();
            //colNum表示一共多少条记录
            int colNum = merchantStoreEntityList.size();
            System.out.println("mysql数据表中colNum= "+colNum);
            switch (dmTableName.toString()) {
                case "merchantStore":
                    //取出MySQL数据表数据MerchantStoreEntityList
                    QueryWrapper<DMmerchantStoreEntity> queryWrapper1 = new QueryWrapper<>();
//                    queryWrapper1.select("id");
                    // mysql里面MerchantStore表的数据
//                    List<DMmerchantStoreEntity> dMMerchantStoreEntityList = dmMerchantStoreDao.selectList(queryWrapper1);
                    int dmCol = dmMerchantStoreDao.selectCount(queryWrapper1);
                    System.out.printf("DM对应表中现有%d条, 还需要导入%d条\n", dmCol,colNum-dmCol);
                    //对每条记录进行相应赋值操作
                    for (int i = dmCol; i < colNum; i++) {
                        //根据每个id索引获取该条全部信息，进行赋值
                        QueryWrapper<merchantStoreEntity> queryWrapper2 = new QueryWrapper<>();
                        queryWrapper2.eq("id", merchantStoreEntityList.get(i).getId());
                        // mysql里面ledgerSellItem表的数据

                        merchantStoreEntity sigle_merchantStoreEntity = MerchantStoreDao.selectOne(queryWrapper2);
                        dmMerchantStoreDao.insert(sigle_merchantStoreEntity);
                        System.out.println("已插入第 "+(i+1)+" 行，id为： "+sigle_merchantStoreEntity.getId());

                    }
                    break;

                default:
                    System.out.println("没有配置相关表的对应关系");
            }

        }
    }

    @Override
    public void updateMerchantStoreBusinessLabel() {
        BeanMap mysqlTableColMap = BeanMap.create(merchantStoreBusinessLabelMap);
        System.out.println("---开始同步merchantStoreBussinessLable表---");
        //dmTableName表示DMSQL表名
        for (Object dmTableName : mysqlTableColMap.keySet()) {
            System.out.println("本次数据同步对应的DMSQL表名： ");
            System.out.println(dmTableName);
            System.out.println("字段对应关系为： ");
            //colMap储存字段对应关系
            Map<String, String> colMap = (Map<String, String>) mysqlTableColMap.get(dmTableName);
            System.out.println(colMap);
            if(colMap==null){
                continue;
            }
            //dMMerchantStoreBussinessLableEntityList
            List<merchantStoreBussinessLabelEntity> merchantStoreBussinessLableEntityList = merchantStoreBussinessLabelService.getAll_id();
            //colNum表示一共多少条记录
            int colNum = merchantStoreBussinessLableEntityList.size();
            System.out.println("mysql数据表中colNum= "+colNum);
            switch (dmTableName.toString()) {
                case "merchantStoreBusinessLabel":
                    //取出MySQL数据表数据MerchantStoreBussinessLableEntityList
                    QueryWrapper<DMmerchantStoreBussinessLabelEntity> queryWrapper1 = new QueryWrapper<>();
//                    queryWrapper1.select("id");
                    // mysql里面MerchantStoreBussinessLable表的数据
//                    List<DMmerchantStoreBussinessLabelEntity> dMMerchantStoreBussinessLableEntityList = dmMerchantStoreBussinessLabelDao.selectList(queryWrapper1);
                    int dmCol = dmMerchantStoreBussinessLabelDao.selectCount(queryWrapper1);
                    System.out.printf("DM对应表中现有%d条, 还需要导入%d条\n", dmCol,colNum-dmCol);
                    //对每条记录进行相应赋值操作
                    for (int i = dmCol; i < colNum; i++) {
                        //根据每个id索引获取该条全部信息，进行赋值
                        QueryWrapper<merchantStoreBussinessLabelEntity> queryWrapper2 = new QueryWrapper<>();
                        queryWrapper2.eq("id", merchantStoreBussinessLableEntityList.get(i).getId());
                        // mysql里面ledgerSellItem表的数据

                        merchantStoreBussinessLabelEntity sigle_merchantStoreBussinessLabelEntity = MerchantStoreBussinessLabelDao.selectOne(queryWrapper2);
                        dmMerchantStoreBussinessLabelDao.insert(sigle_merchantStoreBussinessLabelEntity);
                        System.out.println("已插入第 "+(i+1)+" 行，id为： "+sigle_merchantStoreBussinessLabelEntity.getId());
                    }
                    break;

                default:
                    System.out.println("没有配置相关表的对应关系");
            }

        }
    }

    @Override
    public void updateMerchantStoreLicense()  {
        BeanMap mysqlTableColMap = BeanMap.create(merchantStoreLicenseMap);
        System.out.println("---开始同步merchantStoreLicense表---");
        //dmTableName表示DMSQL表名
        for (Object dmTableName : mysqlTableColMap.keySet()) {
            System.out.println("本次数据同步对应的DMSQL表名： ");
            System.out.println(dmTableName);
            System.out.println("字段对应关系为： ");
            //colMap储存字段对应关系
            Map<String, String> colMap = (Map<String, String>) mysqlTableColMap.get(dmTableName);
            System.out.println(colMap);
            if(colMap==null){
                continue;
            }
            //dMMerchantStoreLicenseEntityList
            List<merchantStoreLicenseEntity> merchantStoreLicenseEntityList = merchantStoreLicenseService.getAll_id();
            //colNum表示一共多少条记录
            int colNum = merchantStoreLicenseEntityList.size();
            System.out.println("mysql数据表中colNum= "+colNum);
            switch (dmTableName.toString()) {
                case "merchantStoreLicense":
                    //取出MySQL数据表数据MerchantStoreLicenseEntityList
                    QueryWrapper<DMmerchantStoreLicenseEntity> queryWrapper1 = new QueryWrapper<>();
//                    queryWrapper1.select("id");
                    // mysql里面MerchantStoreLicense表的数据
//                    List<DMmerchantStoreLicenseEntity> dMMerchantStoreLicenseEntityList = dmMerchantStoreLicenseDao.selectList(queryWrapper1)
                    int dmCol =  dmMerchantStoreLicenseDao.selectCount(queryWrapper1);
                    System.out.printf("DM对应表中现有%d条, 还需要导入%d条\n", dmCol,colNum-dmCol);
                    //对每条记录进行相应赋值操作
                    for (int i = dmCol; i < colNum; i++) {
                        //根据每个id索引获取该条全部信息，进行赋值
                        QueryWrapper<merchantStoreLicenseEntity> queryWrapper2 = new QueryWrapper<>();
                        queryWrapper2.eq("id", merchantStoreLicenseEntityList.get(i).getId());
                        // mysql里面ledgerSellItem表的数据

                        merchantStoreLicenseEntity sigle_merchantStoreLicenseEntity = MerchantStoreLicenseDao.selectOne(queryWrapper2);
                        dmMerchantStoreLicenseDao.insert(sigle_merchantStoreLicenseEntity);
                        System.out.println("已插入第 "+(i+1)+" 行，id为： "+sigle_merchantStoreLicenseEntity.getId());
                    }
                    break;

                default:
                    System.out.println("没有配置相关表的对应关系");
            }

        }
    }

    @Override
    public void run() {
        //TableList用于存放要定时同步的表名
        List<String> tableList =new ArrayList<>();
        tableList.add("ledgerSellItem");
        tableList.add("ledgerSeller");
        tableList.add("ledgerStockItem");
        tableList.add("ledgerSupplier");
        tableList.add("ledgerStoreSupplier");
        tableList.add("merchantEmployee");
        tableList.add("merchantEmployeeLicense");
        tableList.add("merchantStore");
        tableList.add("merchantStoreBusinessLabel");
        tableList.add("merchantStoreLicense");
        int tableNum = tableList.size();
        System.out.println("-----定时更新任务启动-----");
        System.out.printf("本次任务更新%d个数据表: ", tableNum);
        System.out.println(tableList);
        //因为可能要同步多个表信息，所以设置一个for循环
        for (String s : tableList) {
            //开始同步任务
            switch (s) {
                case "ledgerSellItem":
                    updateLedgerSellItem();
                    System.out.println("------------------ledgerSellItem表结束---------------------");
                    break;
                case "ledgerSeller":
                    updateLedgerSeller();
                    System.out.println("------------------ledgerSeller表结束-------------------");
                    break;
                case "ledgerStockItem":
                    updateLedgerStockItem();
                    System.out.println("------------------ledgerStockItem表结束--------------------");
                    break;
                case "ledgerStoreSupplier":
                    updateLedgerStoreSupplier();
                    System.out.println("--------------------ledgerStoreSupplier表结束------------------");
                    break;
                case  "ledgerSupplier":
                    updateLedgerSupplier();
                    System.out.println("-------------------ledgerSupplier表结束--------------------");
                    break;
                case "merchantEmployee":
                    updateMerchantEmployee();
                    System.out.println("--------------------merchantEmployee表结束-------------------");
                    break;
                case  "merchantEmployeeLicense":
                    updateMerchantEmployeeLicense();
                    System.out.println("--------------------merchantEmployeeLicense表结束-------------------");
                    break;
                case  "merchantStore":
                    updateMerchantStore();
                    System.out.println("---------------------merchantStore表结束------------------");
                    break;
                case  "merchantStoreBusinessLabel":
                    updateMerchantStoreBusinessLabel();
                    System.out.println("----------------------merchantStoreBusinessLabel表结束-----------------");
                    break;
                case  "merchantStoreLicense":
                    updateMerchantStoreLicense();
                    System.out.println("----------------------merchantStoreLicense表结束-----------------");
                    break;
                default:
                    System.out.println("没有配置该表相关更新程序");
            }
        }
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");//设置日期格式
        String str = format.format(date);
//        System.out.println("现在时间：" + str);
        System.out.println("\n-----更新一次成功,北京时间为： "+ str+" -----\n");
    }
}
