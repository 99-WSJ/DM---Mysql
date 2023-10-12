package com.dbtimer.dbupdatespring.controller;

import com.dbtimer.dbupdatespring.service.DsUpdateService;
import com.dbtimer.dbupdatespring.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;

/**
 * @program: dbupdate_spring
 * @description: 数据库同步更新Controller
 * @author: swx
 * @create: 2022-04-14 16:00
 **/
@RestController
@RequestMapping("/task")
public class DsUpdateController {

    private final Map<String, ScheduledFuture<?>> taskMap=new HashMap<>();
    public Object get(String key){
        return  taskMap.get(key);
    }

    @Autowired
    private ThreadPoolTaskScheduler threadPoolTaskScheduler;
    @Autowired
    DsUpdateService dsUpdateService;
    @RequestMapping("update")
    public R startTask(){
        //采用cron设置定时信息
        String defaultCron="59 59 23 * * ?";

        String name="达梦数据库定时同步到系统数据库";
        ScheduledFuture<?> scheduleTask=threadPoolTaskScheduler.schedule(dsUpdateService,new CronTrigger(defaultCron));
        taskMap.put(name, scheduleTask);
        return R.ok("success");
    }


}
