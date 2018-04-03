package com.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLogIn {

	
	@Before(value = "execution(public void addAccount())")
	public void verifierLogIn() {
		System.out.println("Verification en cours");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Verifié !");
	}
	
}
