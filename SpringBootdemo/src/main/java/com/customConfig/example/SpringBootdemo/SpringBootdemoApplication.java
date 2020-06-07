package com.customConfig.example.SpringBootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;


@EnableAutoConfiguration
@ComponentScan(excludeFilters = {@ComponentScan.Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class)})
@SpringBootConfiguration
public class SpringBootdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootdemoApplication.class, args);
		
	}
}
