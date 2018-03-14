import java.util.ArrayList;
import java.util.List;

public class Temps implements IObservable {

	List<IObserver> observer = new ArrayList<>();
	int heure = 0;
	int minute = 0;
	int seconde = 0;

	
	Temps() {

	}

	public int getSeconde() {
		return this.seconde;
	}

	public int getMinute() {
		return this.minute;
	}

	public int getHeure() {
		return this.heure;
	}

	public void lancementThread() {
		
		while (true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (this.seconde == 59) {
				this.seconde = -1;
				if (this.minute == 59) {
					this.minute = -1;
					this.seconde = -1;
					if (this.heure == 59) {
						this.heure = -1;
						this.minute = -1;
						this.seconde = -1;
					}
					this.heure += 1;
				}
				this.minute += 1;


			}

			this.seconde += 1;
			notifier();
		}
	}

	@Override
	public void notifier() {
		for (IObserver iObserver : observer) {
			iObserver.update();
		}

	}

	@Override
	public void add(IObserver obs) {
		observer.add(obs);

	}

	@Override
	public void remove(IObserver obs) {
		observer.remove(obs);

	}

}
