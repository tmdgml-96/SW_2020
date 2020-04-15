package decorator;

public class order {

	public static void main(String args[]) {
		
		beverage house = new houseBlend();
		System.out.println(house.cost());
		
		beverage house_mocha = new houseBlend();
		house_mocha = new mocha(house_mocha);
		System.out.println(house_mocha.getDescription() + " " +house_mocha.cost());
		
		beverage dark_soy_tall = new darkRoast();
		dark_soy_tall = new soy(dark_soy_tall);
		dark_soy_tall = new tall(dark_soy_tall);
		System.out.println(dark_soy_tall.getDescription() + " " +dark_soy_tall.cost());
				
		beverage espresso_milk_venti = new espresso();
		espresso_milk_venti = new milk(espresso_milk_venti);
		espresso_milk_venti = new venti(espresso_milk_venti);
		System.out.println(espresso_milk_venti.getDescription() + " " +espresso_milk_venti.cost());
	}
}
