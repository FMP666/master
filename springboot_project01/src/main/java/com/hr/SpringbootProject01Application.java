package com.hr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hr.mapper")
public class SpringbootProject01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProject01Application.class, args);
	}
}
