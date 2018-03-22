package JavaAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Wooooo implements ICheeringService{

	@Override
	public String cheerUp() {
		
		return "BOUUUUUUUUUUHHHHHHHHHH";
	}

}
