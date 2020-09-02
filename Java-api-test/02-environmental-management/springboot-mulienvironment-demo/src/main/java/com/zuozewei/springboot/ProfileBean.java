package com.zuozewei.springboot;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import lombok.extern.slf4j.Slf4j;

@Profile("dev") //支持数组:@Profile({"dev","test","product"})
@Configuration
@Slf4j
public class ProfileBean {

	@PostConstruct
	public void init() {
		log.info("dev环境下激活");
	}	
}
