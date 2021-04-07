package oopexcersises;

public class Animal {
	
	protected  String is_cute = "very";
	private int no_of_legs;
	private boolean carnivore;
	
	public void IsCute() {
		System.out.println(is_cute);
	}


	

	public int getNo_of_legs() {
		return no_of_legs;
	}
	public void setNo_of_legs(int no_of_legs) {
		this.no_of_legs = no_of_legs;
	}
	public boolean isCarnivore() {
		return carnivore;
	}
	public void setCarnivore(boolean carnivore) {
		this.carnivore = carnivore;
	}
	
	
	
	

}
