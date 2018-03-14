import java.util.ArrayList;
import java.util.List;

public class Bank implements AjoutObjet<Conseiller> {

	Double taxeBancaire=0d;
	String nom, pays;
	private List <Conseiller> conseiller=new ArrayList<>();

	public Bank(String nom, String pays) {
		this.nom = nom;
		this.pays = pays;
	}
	public void addConseiller(Conseiller conseiller) {
		this.addObject(conseiller, this.getList());
		conseiller.setBank(this);
	}

	
	public Double getTaxeBancaire() {
		return taxeBancaire;
	}
	public void setTaxeBancaire(Double taxeBancaire) {
		this.taxeBancaire += taxeBancaire;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((conseiller == null) ? 0 : conseiller.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((pays == null) ? 0 : pays.hashCode());
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
		Bank other = (Bank) obj;
		if (conseiller == null) {
			if (other.conseiller != null)
				return false;
		} else if (!conseiller.equals(other.conseiller))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (pays == null) {
			if (other.pays != null)
				return false;
		} else if (!pays.equals(other.pays))
			return false;
		return true;
	}

	@Override
	public List<Conseiller> getList() {

		return conseiller;
	}
	@Override
	public String toString() {
		return String.format("Nom : %s", this.getNom());
	}




	
}
