import java.util.ArrayList;
import java.util.List;

public class Modele implements IObservable{

	String texte;
	List<IObserver> listObs=new ArrayList<>();
	Modele(){
		
	}
	Modele(String texte){
		this.texte=texte;
	}

	public String getTexte() {
		return texte;
	}

	public void setTexte(String texte) {
		this.texte = texte;
		notifier();
	}
	
	@Override
	public void notifier() {
		for (IObserver iObserver : listObs) {
			iObserver.update(this.texte);
		}	
	}
	
	@Override
	public void add(IObserver obs) {
		listObs.add(obs);
		
	}
	@Override
	public void remove(IObserver obs) {
		listObs.remove(obs);
		
	}
}
