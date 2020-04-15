package decorator;

public class mocha extends condimentDecorator{
	
	private beverage beverage;
	
	public mocha(decorator.beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public double cost() {
		return 500 + beverage.cost();
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " MoCha";
	}

}
