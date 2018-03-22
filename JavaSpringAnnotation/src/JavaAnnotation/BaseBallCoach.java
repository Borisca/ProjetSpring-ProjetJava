package JavaAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//Scope
//@Scope("prototype")
public class BaseBallCoach implements Coach {
//	ANNOTATION POUR CHANGER LA VALEUR DE MA VARIABLE ET APPELé LE CONSTRUCTEUR PAR DEFAUT
//	@Autowired
//	@Qualifier("makeItClap")	
	ICheeringService cheeringService;
	static int a=0;
	
	
	//ANNOTATION POUR APPELE LE CONSTRUCTEUR AVEC ARGUMENTS	
	@Autowired
	public BaseBallCoach(@Qualifier("makeItClap") ICheeringService cheeringService) {
		this.cheeringService=cheeringService;
		System.out.println("Constructeur BaseBallCoach");
		a++;
	}

	@Override
	public String getDailyWorkOut() {
		return "Entrainement de BaseBall"+" "+a+" "+this.hashCode();
	}

	@Override
	public String cheerUp() {
		return this.cheeringService.cheerUp();
	}
	
	@PostConstruct
	public void doStart() {
		System.out.println("Bonjour BaseBallCoach");
	}
	
	@PreDestroy
	public void doClose() {
		System.out.println("Aurevoir BaseBallCoach");
	}


	public ICheeringService getCheeringService() {
		return cheeringService;
	}
//ANNOTATION POUR APPELE CONSTRUCTEUR AVEC SETTER
//	@Autowired
//	@Qualifier("wooooo")
	public void setCheeringService(ICheeringService cheeringService) {
		this.cheeringService = cheeringService;
	}
	

	
}
