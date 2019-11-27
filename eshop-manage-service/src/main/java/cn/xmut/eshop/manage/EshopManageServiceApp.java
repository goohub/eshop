package cn.xmut.eshop.manage;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Hello world!
 */
@MapperScan(basePackages = {"cn.xmut.eshop.manage.mapper"})
@EnableDubbo
@SpringBootApplication
public class EshopManageServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(EshopManageServiceApp.class, args);
    }

}
