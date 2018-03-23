
public class Main {
	public static void main(String[] args) {

		Equipe lakers =new Equipe(Sport.BASKETBALL,"Lakers");
		Joueur shaq=new Joueur("Shaquille O'Neal", Sport.BASKETBALL);
		lakers.addJoueur(shaq);
		Equipe nice =new Equipe(Sport.FOOTBALL, "OGC NICE");
		Joueur j1  =new Joueur("A", Sport.FOOTBALL);
		Joueur j2  =new Joueur("B", Sport.FOOTBALL);
		Joueur j3  =new Joueur("C", Sport.FOOTBALL);
		Joueur j4  =new Joueur("D", Sport.BASEBALL);
		Joueur j5  =new Joueur("E", Sport.FOOTBALL);
		Joueur j6  =new Joueur("F", Sport.FOOTBALL);
		Joueur j7  =new Joueur("G", Sport.FOOTBALL);
		Joueur j8  =new Joueur("H", Sport.FOOTBALL);
		Joueur j9  =new Joueur("I", Sport.FOOTBALL);
		nice.addJoueur(j1);
		nice.addJoueur(j2);
		nice.addJoueur(j3);
		nice.addJoueur(j4);
		nice.addJoueur(j5);
		nice.addJoueur(j6);
		nice.addJoueur(j7);
		nice.addJoueur(j8);
		nice.addJoueur(j9);
		
		Equipe leHavre=new Equipe(Sport.FOOTBALL, "Le Hac");
		Joueur h1  =new Joueur("a", Sport.FOOTBALL);
		Joueur h2  =new Joueur("b", Sport.FOOTBALL);
		Joueur h3  =new Joueur("c", Sport.FOOTBALL);
		Joueur h4  =new Joueur("d", Sport.BASEBALL);
		Joueur h5  =new Joueur("e", Sport.FOOTBALL);
		Joueur h6  =new Joueur("f", Sport.FOOTBALL);
		Joueur h7  =new Joueur("g", Sport.FOOTBALL);
		Joueur h8  =new Joueur("h", Sport.FOOTBALL);
		Joueur h9  =new Joueur("i", Sport.FOOTBALL);
		
		leHavre.addJoueur(h1);
		leHavre.addJoueur(h2);
		leHavre.addJoueur(h3);
		leHavre.addJoueur(h4);
		leHavre.addJoueur(h5);
		leHavre.addJoueur(h6);
		leHavre.addJoueur(h7);
		leHavre.addJoueur(h8);
		leHavre.addJoueur(h9);
		
		System.out.println(nice);
		
		nice.affronterEquipe(leHavre);
		leHavre.affronterEquipe(lakers);
		System.out.println(lakers);
		
		Sport.FOOTBALL.getEquipeSport();
		Sport.BASKETBALL.getJoueurSport();
	}
}
