package appliances;

public class DishWasher {
	private boolean hasWorkTodo = false;

	protected void doDishes() {
		if (hasWorkTodo) System.out.println("Washing the dishes...");
		hasWorkTodo = false;
	}

	public void setHasWorkTodo (boolean hasWorkTodo) {
		this.hasWorkTodo = hasWorkTodo;
	}
}
