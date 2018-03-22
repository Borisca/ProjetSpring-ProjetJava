package JavaAnnotation;

import org.springframework.stereotype.Component;

@Component("makeItClap")
public class Clap implements ICheeringService{

	@Override
	public String cheerUp() {
		
		return "Applaudissement";
	}

}
