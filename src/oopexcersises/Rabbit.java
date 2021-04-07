package oopexcersises;

public class Rabbit extends Animal {
	
	private int teeth = 2;
	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	private String food;
	
	public void nash() {
		System.out.println("Rabbits have " + teeth + " teeth");
	}

}
