import com.display.*;
import com.fly.*;
import com.quack.*;

public class main {

	public static void main(String[] args) {
		
		Duck canard1= new Duck(new DisplayText(), new Nofly(), new SimpleQuack(), "Canard en plastique");
		
		canard1.quack();
		canard1.fly();
		canard1.display();

	}

}
