import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable{

	int temperature;
	Observer obs;
	List<Observer>listObserver=new ArrayList<>();
	
	public WeatherStation() {

	}
	

	@Override
	public void notifier() {
		
		for (Observer observer : listObserver) {

			observer.update();
		}
		
	}

	@Override
	public void add(Observer obs) {
		listObserver.add(obs);
	}

	@Override
	public void remove(Observer obs) {
		listObserver.remove(obs);
	}
	
	public int getTemperature() {	
		return this.temperature;
	}

	public void temperatureChange(int temperature) {
		this.temperature=temperature;
		notifier();
	}
}
