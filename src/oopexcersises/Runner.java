package oopexcersises;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Cat cleo = new Cat();
//		cleo.isCute();
//		cleo.whiskers(50);
//		cleo.setNo_of_legs(4);
//		System.out.println("Cleo has "+ cleo.getNo_of_legs()+ " legs");
//		
//		Rats barry = new Rats();
//		barry.IsCute();
//		
		
		
		Car ford  = new Car(true, "V8", 1200, 10, "BLUE", 120, 5);
		Motorbike ducatti = new Motorbike(true,"V-twin", 300, 1, "RED", 12);
		Van transit =  new Van(false, "2.1L Turbo", 2000, 7, "white", 4);
		System.out.println(ford.toString());
		System.out.println(ducatti.toString());
		System.out.println(transit.toString());
	}

}
