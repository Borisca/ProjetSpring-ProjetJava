
public class PhoneDevice implements Observer,IDisplay{

	WeatherStation station;
	
	PhoneDevice(WeatherStation station){
		this.station=station;
		station.add(this);
	}
	
	@Override
	public void update() {

		station.getTemperature();
		display();
	}

	@Override
	public void display() {
		System.out.println(station.getTemperature());
	}

}
