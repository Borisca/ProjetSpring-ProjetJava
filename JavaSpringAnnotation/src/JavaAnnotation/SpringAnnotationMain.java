package JavaAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationMain {

	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach baseball=context.getBean("baseBallCoach",Coach.class);
		Coach baseball2=context.getBean("baseBallCoach",Coach.class);
		System.out.println(baseball.getDailyWorkOut());
		System.out.println(baseball.cheerUp());
		System.out.println(baseball2.cheerUp());
		context.close();
	}
}
