
public class Joueur {
	private String nom;
	private Sport sport;
	
	public Joueur(String nom, Sport sport) {
		this.nom = nom;
		this.sport = sport;
		this.sport.addJoueur(this);
	}
	public void addToEquipe(Equipe equipe){
		equipe.addJoueur(this);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}
	
	@Override
	public String toString() {
		return "nom du joueur :"+this.nom;
	}
	
	
}
