package decorator;

public class grande extends beverageSize {

	private beverage beverage;
	
	public grande(beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return " (grande:1000¿ø Ãß°¡) ";
	}

	@Override
	public double cost() {
		return beverage.cost() + 1000;
	}

}
