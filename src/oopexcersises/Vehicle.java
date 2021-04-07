package oopexcersises;

public abstract class Vehicle {
	
	private boolean damage;
	private String engine;
	private int weight;
	private int age;
	private String colour;



	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isDamage() {
		return damage;
	}
	public void setDamage(boolean damage) {
		this.damage = damage;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}

	
	
	
	

}
