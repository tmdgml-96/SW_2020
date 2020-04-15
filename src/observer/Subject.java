package observer;

// Observer pattern - Interface

// 2020 03 25

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers( );
	
	public interface Observer {
		public void update( float temp, float humidity, float pressure) ;
	}
	
	public interface DisplayElement {
		public void display( );
	}
	
}
