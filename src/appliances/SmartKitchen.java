package appliances;

public class SmartKitchen {
	private final DishWasher dishWater;
	private final Refrigerator fridge;
	private final CoffeeMaker coffeeMaker;
	public SmartKitchen(DishWasher dishWater, Refrigerator fridge, CoffeeMaker coffeeMaker) {
		this.dishWater = dishWater;
		this.fridge = fridge;
		this.coffeeMaker = coffeeMaker;
	}

	private void addWater () {
		coffeeMaker.brewCoffee();
	}

	private void pourMilk () {
		fridge.orderFood();
	}

	private void loadDishwasher () {
		dishWater.doDishes();
	}

	public void setKitchenState(boolean isCoffeeMakerOn, boolean isDishWaterOn, boolean isRefrigeratorOn) {
		coffeeMaker.setHasWorkTodo(isCoffeeMakerOn);
		dishWater.setHasWorkTodo(isDishWaterOn);
		fridge.setHasWorkTodo(isRefrigeratorOn);
	}

	public void doKitchenWork() {
		this.addWater();
		this.pourMilk();
		this.loadDishwasher();
	}


}
