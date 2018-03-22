package JavaFullAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Clap implements ICheeringService {

	public Clap() {
		System.out.println("Constructeur de Clap" + " " + this.hashCode());
	}

	@Override
	public String cheerUp() {

		return "Applaudissement";
	}

}
