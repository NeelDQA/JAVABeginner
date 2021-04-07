package oopexcersises;

public class Motorbike extends Vehicle {
	
	private int wheelsize;

	public int getWheelsize() {
		return wheelsize;
	}

	public void setWheelsize(int wheelsize) {
		this.wheelsize = wheelsize;
	}
	
	
	public Motorbike(boolean damage, String engine, int weight ,int age, String colour, int wheelsize) {
		this.setDamage(damage);
		this.setEngine(engine);
		this.setWeight(weight);
		this.setAge(age);
		this.setColour(colour);
		this.setWheelsize(wheelsize);

}

	@Override
	public String toString() {
		return "Motorbike [wheelsize=" + wheelsize + ", getColour()="
				+ getColour() + ", getWeight()=" + getWeight() + ", getAge()=" + getAge() + ", isDamage()=" + isDamage()
				+ ", getEngine()=" + getEngine() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
}
