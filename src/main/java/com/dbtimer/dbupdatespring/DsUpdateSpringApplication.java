package com.dbtimer.dbupdatespring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author swx
 */
@SpringBootApplication
@EnableScheduling
@MapperScan("com.dbtimer.dbupdatespring.dao")
public class DsUpdateSpringApplication {

    public static void main(String[] args) {

        SpringApplication.run(DsUpdateSpringApplication.class, args);
        try {
            Runtime.getRuntime().exec("curl http://localhost:8000/task/update");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
