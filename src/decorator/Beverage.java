package decorator;

// 2020 03 25

public abstract class beverage {
	
	private String description = "음료 주문 ";
	
	public abstract double cost();

	public String getDescription() {
		return this.description;
	}
	
}
