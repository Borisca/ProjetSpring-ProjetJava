import java.util.ArrayList;
import java.util.List;

public class Equipe {
	private List<Joueur> listJoueur;
	private Sport sport;
	private String name;

	public Equipe(Sport sport, String name) {
		listJoueur = new ArrayList<>();
		this.sport = sport;
		this.name = name;
		this.sport.addEquipe(this);
	}

	public void addJoueur(Joueur joueur) {
		if (joueur.getSport().equals(this.getSport()))
			listJoueur.add(joueur);
		else
			System.out.println(joueur.getNom() + " ne pratique pas le " + this.getSport());
	}

	public Sport getSport() {
		return sport;
	}

	public void setSport(Sport sport) {
		this.sport = sport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		StringBuilder build = new StringBuilder();
		build.append(this.name);
		build.append("\n");
		for (Joueur joueur : listJoueur) {
			build.append(joueur);
			build.append("\n");
		}
		return build.toString();

	}

	public void affronterEquipe(Equipe equipe) {
		int a = 1 + (int)(Math.random() * ((2 -1) + 1));

		if (this.sport.equals(equipe.getSport())) {
			if(a%2==0)
				System.out.println(this.getName()+" a gagné");
			else
				System.out.println(equipe.getName()+" a gagné");
		}else
			System.out.println("Les deux equipes ne jouent pas au meme sport");
	}
}
