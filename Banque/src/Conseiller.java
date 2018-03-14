import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Conseiller implements AjoutObjet<Utilisateur> {

	String nom, prenom;
	List<Utilisateur> utilisateur = new ArrayList<>();
	List<Compte> compte = new ArrayList<>();
	Bank bank;

	public Conseiller(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}

	public Conseiller(String nom, String prenom, Bank bank) {
		this.nom = nom;
		this.prenom = prenom;
		this.bank = bank;
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

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	public Bank getBank() {
		return this.bank;
	}

	public String afficherHistorique(Utilisateur user) {
		return rechercheCompte(user).afficherHistorique();
	}

	public boolean virementUser1ToUser2(Utilisateur user1, Utilisateur user2, Double montant) {

		if (rechercheCompte(user1) == null) {
			System.err.println("Ce conseiller n'a aucun droit sur ce compte");
			return false;
		}
		Compte compte1 = rechercheCompte(user1);
		Compte compte2 = user2.getConseiller().rechercheCompte(user2);
		compte1.setSolde(-montant);
		if (!user1.getConseiller().getBank().equals(user2.getConseiller().getBank())) {
			user1.getConseiller().getBank().setTaxeBancaire(montant*0.05);
			montant -= montant * 0.05;
			
		}
		compte2.setSolde(+montant);
		return true;
	}

	public void ajouterArgent(Utilisateur user, Double montant) {

		rechercheCompte(user).setSolde(montant);
	}
	public void retirerArgent(Utilisateur user, Double montant) {

		rechercheCompte(user).setSolde(-montant);
	}

	public Double getSolde(Utilisateur user) {

		return rechercheCompte(user).getSolde();

	}

	public boolean creerCompte(Utilisateur user) {

		if (rechercheCompte(user) != null) {

			return false;
		}
		this.addObject(user, this.getList());
		compte.add(new Compte(user));
		user.setConseiller(this);
		return true;
	}

	public boolean creerCompteAvecRessource(Utilisateur user, Double solde) {

		if (rechercheCompte(user) != null) {

			return false;
		}
		this.addObject(user, this.getList());
		compte.add(new Compte(user, solde));
		user.setConseiller(this);
		return true;
	}

	private Compte rechercheCompte(Utilisateur user) {
		Iterator<Compte> it = compte.iterator();
		Compte temp;
		while (it.hasNext()) {
			temp = it.next();
			if (temp.getUser().equals(user))
				return temp;
		}
		return null;
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
		Conseiller other = (Conseiller) obj;
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
		return String.format("Mr.%s %s", this.nom, this.prenom);
	}

	private class Compte {

		private Utilisateur user;
		Double solde = 0d;
		List<Double> historique = new ArrayList<>();
		List<Character> signe = new ArrayList<>();

		protected Compte(Utilisateur user) {
			this.user = user;
		}

		protected Compte(Utilisateur user, Double solde) {
			this.user = user;
			this.solde = solde;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((user == null) ? 0 : user.hashCode());
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
			Compte other = (Compte) obj;
			if (user == null) {
				if (other.user != null)
					return false;
			} else if (!user.equals(other.user))
				return false;
			return true;
		}

		private Utilisateur getUser() {
			return user;
		}

		public Double getSolde() {
			return solde;
		}

		private void setSolde(Double montant) {

			this.solde += montant;
			if (montant > 0)
				this.signe.add('+');
			else
				this.signe.add(' ');

			historique.add(montant);
		}

		private String afficherHistorique() {
			StringBuilder build=new StringBuilder();
			build.append("<html>");
			for (int i = 0; i < this.historique.size(); i++) {
				build.append(this.signe.get(i));
				build.append(this.historique.get(i));
				build.append("<br>");

			}
			build.append("Solde restant : ");
			build.append(this.getSolde());
			build.append("<br>");
			build.append("</html>");
			return build.toString();
		}

	}

	@Override
	public List<Utilisateur> getList() {

		return utilisateur;
	}

}
