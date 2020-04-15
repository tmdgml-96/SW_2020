package decorator;

public class soy extends condimentDecorator {
	
	private beverage beverage;
	
	public soy(decorator.beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public double cost() {
		return 600 + beverage.cost();
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " Soy";
	}
}
