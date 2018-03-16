public class Main {

	public static void main(String[] args) {
		
		/*
		 new Modele();
		 new Controller (modele);
		 new Fenetre(controller);
		 modele.addObserver(Fenetre);
		 */
		
		
		Modele b =new Modele();
		
		
		Vue a=new Vue();
		Controller c = new Controller(b, a.getTxt());
		a.getBouton().addActionListener(c);
		for (int i = 0; i < a.getLabel().length; i++) {		
			a.getLabel()[i].addModel(b);
		}
		
	

	}
}
