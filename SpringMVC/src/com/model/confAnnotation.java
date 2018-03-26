package com.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class confAnnotation {

	@Bean
	public Student createMyStudent() {
		
		return new Student();
	}

}
