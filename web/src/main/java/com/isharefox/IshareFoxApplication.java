package com.isharefox;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.isharefox.repo.mapper")
@SpringBootApplication
public class IshareFoxApplication {
	public static void main(String[] args) {
		SpringApplication.run(IshareFoxApplication.class, args);
	}
}
