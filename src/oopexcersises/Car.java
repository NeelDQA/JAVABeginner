package oopexcersises;

public class Car extends Vehicle{
	private int topSpeed;
	private int doors;
	
public Car(boolean damage, String engine, int weight ,int age,String colour, int topSpeed, int doors) {
		this.setDamage(damage);
		this.setEngine(engine);
		this.setWeight(weight);
		this.setAge(age);
		this.setColour(colour);
		this.setTopSpeed(topSpeed);
		this.setDoors(doors);
	
		}









@Override
public String toString() {
	return "Car topSpeed=" + topSpeed + ", doors=" + doors +  ", getColour()=" + getColour() + ", getWeight()=" + getWeight() + ", getAge()=" + getAge()
			+ ", isDamage()=" + isDamage() + ", getEngine()=" + getEngine() + ", getClass()=" + getClass()
			+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}









public int getTopSpeed() {
	return topSpeed;
}

public void setTopSpeed(int topSpeed) {
	this.topSpeed = topSpeed;
}

public int getDoors() {
	return doors;
}

public void setDoors(int doors) {
	this.doors = doors;
}
}
