package decorator;

public class milk extends condimentDecorator{
	
	private beverage beverage;

	public milk(decorator.beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return beverage.cost() + 500;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " Milk";
	}
}
