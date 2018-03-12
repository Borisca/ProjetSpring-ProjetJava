import com.display.IDisplayBehavior;
import com.fly.IFlyBehavior;
import com.quack.IQuackBehavior;

public class Duck implements IDisplayBehavior,IQuackBehavior,IFlyBehavior{

	IDisplayBehavior displayBehavior;
	IFlyBehavior flyBehavior;
	IQuackBehavior quackBehavior;
	String nom;
	
	public Duck(IDisplayBehavior displayBehavior, IFlyBehavior flyBehavior, IQuackBehavior quackBehavior, String nom) {
		this.displayBehavior = displayBehavior;
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
		this.nom = nom;
	}

	@Override
	public void fly() {		
		this.flyBehavior.fly();		
	}

	@Override
	public void quack() {
		this.quackBehavior.quack();	
	}

	@Override
	public void display() {
		this.displayBehavior.display();		
	}
	
	
	
}
