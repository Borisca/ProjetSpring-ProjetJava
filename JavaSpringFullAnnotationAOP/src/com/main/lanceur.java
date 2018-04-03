package com.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.accountdao.AccountDaoImpl;
import com.config.Configu;

public class lanceur {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context =new AnnotationConfigApplicationContext(Configu.class);

		AccountDaoImpl a=context.getBean("account",AccountDaoImpl.class);
		
		a.addAccount();
		
		context.close();
	}

}
