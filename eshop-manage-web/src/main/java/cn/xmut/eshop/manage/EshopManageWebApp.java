package cn.xmut.eshop.manage;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@EnableDubbo
@SpringBootApplication
public class EshopManageWebApp {

    public static void main(String[] args) {
        SpringApplication.run(EshopManageWebApp.class, args);
    }

}
