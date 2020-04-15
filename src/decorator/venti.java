package decorator;

public class venti extends beverageSize{

	private beverage beverage;
	
	public venti(beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + " (Venti Size : 1500�� �߰�) ";
	}

	@Override
	public double cost() {
		return 1500 + beverage.cost();
	}

}
