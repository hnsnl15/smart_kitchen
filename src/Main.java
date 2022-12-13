import appliances.CoffeeMaker;
import appliances.DishWasher;
import appliances.Refrigerator;
import appliances.SmartKitchen;

public class Main {
	public static void main(String[] args) {
		Refrigerator fridge = new Refrigerator();
		CoffeeMaker coffeeMaker = new CoffeeMaker();
		DishWasher dishWasher = new DishWasher();

		SmartKitchen smartKitchen = new SmartKitchen(dishWasher, fridge, coffeeMaker);
		smartKitchen.setKitchenState(false, true, true);
		smartKitchen.doKitchenWork();
	}
}
