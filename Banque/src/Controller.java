
public class Controller {

	Fenetre fen;
	MenuListener menuListener;


	public Controller() {
		
		menuListener = new MenuListener(this);
		fen = new Fenetre(menuListener,this);
	}

	public Fenetre getFen() {
		return fen;
	}
	
	

}
