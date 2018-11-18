package com.zombei.personalweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
/**/
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class},
        scanBasePackages={"com.zombei.personalweb"})
/*通过注解自动注入Servlet*/
@ServletComponentScan
public class StartSpringApplication {
    public static void main(String[] args){
        SpringApplication.run(StartSpringApplication.class,args);
    }
}
