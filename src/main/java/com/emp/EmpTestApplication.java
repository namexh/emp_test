package com.emp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.emp.mappers")
public class EmpTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmpTestApplication.class, args);
    }

}
