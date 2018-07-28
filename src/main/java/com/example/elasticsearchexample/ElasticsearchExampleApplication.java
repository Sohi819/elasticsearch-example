package com.example.elasticsearchexample;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.elasticsearchexample.dal.mapper")
public class ElasticsearchExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticsearchExampleApplication.class, args);
	}
}
