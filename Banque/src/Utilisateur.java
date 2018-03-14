public class Utilisateur {

	private String nom,prenom;
	private Conseiller conseiller;
	
	public Utilisateur(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;

	} 

	public Utilisateur(String nom, String prenom,Conseiller conseiller) {
		this.nom = nom;
		this.prenom = prenom;
		this.setConseiller(conseiller);
		conseiller.creerCompte(this);

	} 
	
	public void afficherHistorique() {
		System.out.println(this.toString());
		this.conseiller.afficherHistorique(this);
		System.out.print("Solde :");
		System.out.println(this.getSolde());
		System.out.println("_______________________________");
	}
	

	public void setConseiller(Conseiller conseiller) {
		this.conseiller=conseiller;
	}
	public Double getSolde() {
		return conseiller.getSolde(this);
	}
	

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Conseiller getConseiller() {
		return conseiller;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((prenom == null) ? 0 : prenom.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Utilisateur other = (Utilisateur) obj;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (prenom == null) {
			if (other.prenom != null)
				return false;
		} else if (!prenom.equals(other.prenom))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return String.format("Mr.%s %s || Conseiller %s", this.nom, this.prenom,this.conseiller);
	}
	
	
}
