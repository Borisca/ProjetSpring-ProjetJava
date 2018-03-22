package abcd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import JavaFullAnnotation.BaseBallCoach;
import JavaFullAnnotation.Clap;
import JavaFullAnnotation.Coach;
import JavaFullAnnotation.CricketCoach;
import JavaFullAnnotation.ICheeringService;
import JavaFullAnnotation.PiscineCoach;

@Configuration
@PropertySource("classpath:Info.properties")
public class confAnnotation {

//	@Value("${x.email}")
//	private String email;
//	@Value("${x.nomEquipe}")
//	private String nomEquipe;
	
	//Permet de rentrer le fichier txt dans la variable environnement. Ensuite env.getProperty(String )
	@Autowired
	private Environment env;
	
	@Bean
	public Coach baseBallCoach() {
		
		System.out.println("base ball configuration");


		
		return new BaseBallCoach(clap());
		
	}
	@Bean
	public Coach cricketCoach() {
		System.out.println("CricketCoach conf");
		return new CricketCoach(clap());
	}

	
	
	@Bean
	public ICheeringService clap() {
		
		System.out.println("clap configuration");
		
		return new Clap();
		
	}
	@Bean
	public Coach piscineCoach() {
		PiscineCoach a=new PiscineCoach(clap(),env.getProperty("x.email"),env.getProperty("x.nomEquipe"));
		return a;
	}
}
