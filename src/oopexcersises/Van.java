package oopexcersises;

public class Van extends Vehicle {
	private int wheelNo;

	public int getWheelNo() {
		return wheelNo;
	}

	public void setWheelNo(int wheelNo) {
		this.wheelNo = wheelNo;
	}
	
	public Van (boolean damage, String engine, int weight ,int age,String colour, int wheelNo) {
		
		this.setDamage(damage);
		this.setEngine(engine);
		this.setWeight(weight);
		this.setAge(age);
		this.setColour(colour);
		this.setWheelNo(wheelNo);
	}

	@Override
	public String toString() {
		return "Van [wheelNo=" + wheelNo + ", getColour()=" + getColour() + ", getWeight()=" + getWeight()
				+ ", getAge()=" + getAge() + ", isDamage()=" + isDamage() + ", getEngine()=" + getEngine()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	

}
