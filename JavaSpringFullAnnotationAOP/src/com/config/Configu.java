package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.accountdao.AccountDaoImpl;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.aspect")
public class Configu {


	
	@Bean("account")
	public AccountDaoImpl creerAccount() {
		
		return new AccountDaoImpl();
	}
	
	
	
	
}
