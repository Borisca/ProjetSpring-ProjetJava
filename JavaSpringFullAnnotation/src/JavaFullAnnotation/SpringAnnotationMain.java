package JavaFullAnnotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import abcd.confAnnotation;

public class SpringAnnotationMain {

	
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(confAnnotation.class);
		
		Coach baseball=context.getBean("baseBallCoach",Coach.class);
		Coach cricket=context.getBean("cricketCoach",Coach.class);
		PiscineCoach piscine =context.getBean("piscineCoach",PiscineCoach.class);
		System.out.println(piscine.getEmail());
		System.out.println(piscine.getNomEquipe());
//		System.out.println(baseball.getDailyWorkOut());
//		System.out.println(baseball.cheerUp());
//		System.out.println(baseball2.cheerUp());
		context.close();
	}
}
