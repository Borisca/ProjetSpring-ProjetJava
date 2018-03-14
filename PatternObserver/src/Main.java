
public class Main {

	public static void main(String[] args) {
		WeatherStation station=new WeatherStation();
		PhoneDevice phone=new PhoneDevice(station);
		DesktopDevice desktop= new DesktopDevice(station);
		
		station.temperatureChange(10);
		station.temperatureChange(20);
		

	}

}
