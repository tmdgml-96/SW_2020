package decorator;

public class tall extends beverageSize {

	private beverage beverage;
	
	public tall(beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " (tall Size:기본 사이즈) ";
	}

	@Override
	public double cost() {
		return beverage.cost() + 0.0;
	}
	
}
