package observer;

import observer.Subject.Observer;

public class GeneralDisplay implements Observer{

	private float temperature;
	private float humidity;
	private float pressure;
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
	}
	
	public void display() {
		System.out.println("temperature = " + temperature);
	}

}
