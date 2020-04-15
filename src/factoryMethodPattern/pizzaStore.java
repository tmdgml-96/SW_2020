package factoryMethodPattern;

// 2020. 04. 01

public abstract class pizzaStore {

	public Pizza orderPizza(String type) {

		Pizza pizza;

		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;

	}

	abstract Pizza createPizza(String type);
}
