import java.util.ArrayList;
import java.util.List;

public enum Sport {

	FOOTBALL("FootBall"), BASKETBALL("BasketBall"),HANDBALL("HandBall"),BASEBALL("BaseBall");

	final String name;
	List<Equipe> listEquipe;
	List<Joueur>listJoueur;

	private Sport(String name) {
		this.name = name;
		this.listEquipe=new ArrayList<>();
		this.listJoueur=new ArrayList<>();
	}
	
	public void addEquipe(Equipe equipe) {
		this.listEquipe.add(equipe);
	}
	public void addJoueur(Joueur joueur) {
		this.listJoueur.add(joueur);
	}
	public void getEquipeSport() {
		System.out.println("Liste des equipe de " + this.name);
		for (Equipe equipe : this.listEquipe) {
			System.out.println(equipe);
		}
	}
	public void getJoueurSport() {
		System.out.println("Liste des joueurs de " + this.name);
		for (Joueur joueur : this.listJoueur) {
			System.out.println(joueur);
		}
	}
}
