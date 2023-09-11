package cvicenie3;

public class Rectangle {
	double a, b;
	
	public Rectangle(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	double area() {  // obsah
		return this.a * this.b;
	}
	
	double cicruit() {  // obvod
		return (2*(this.a + this.b));
	}
}
