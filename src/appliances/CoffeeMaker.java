package appliances;

public class CoffeeMaker {
	private boolean hasWorkTodo = false;

	protected void brewCoffee() {
		if (hasWorkTodo) System.out.println("Brewing coffee...");
		hasWorkTodo = false;
	}

	public void setHasWorkTodo(boolean hasWorkTodo) {
		this.hasWorkTodo = hasWorkTodo;
	}
}
