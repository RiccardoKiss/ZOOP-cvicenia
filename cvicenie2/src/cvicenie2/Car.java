package cvicenie2;

public class Car {
	int price;
	String metal;
	
	public Car(int price) {	// constructor
		this.price = price;
	}
	
	public void getPrice() {
		System.out.println(this.price);
	}
}
