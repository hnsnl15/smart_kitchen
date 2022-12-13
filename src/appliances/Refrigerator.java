package appliances;

public class Refrigerator {
	private boolean hasWorkTodo = false;

	protected void orderFood() {
		if (hasWorkTodo) System.out.println("Ordering food...");
		hasWorkTodo = false;
	}

	public void setHasWorkTodo (boolean hasWorkTodo) {
		this.hasWorkTodo = hasWorkTodo;
	}
}
