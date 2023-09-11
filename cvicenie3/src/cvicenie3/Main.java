// cvicenie 3
package cvicenie3;

import java.util.Random;
// ((55,4 - 20) + 4 × 5,1 - (44 - 12))3

public class Main {

	public static void main(String[] args) {
		double tmpResult = (55.4 - 20);
		tmpResult += (4 * 5.1);
		tmpResult -= (44 - 12);
		System.out.printf("((55,4 - 20) + 4 × 5,1 - (44 - 12))3 = %f\n", Math.pow(tmpResult, 3.0));
		Rectangle rect1 = new Rectangle(5.0, 10.0);
		Rectangle rect2 = new Rectangle(15.0, 20.0);
		Rectangle rect3 = new Rectangle(25.0, 25.0);
		System.out.printf("rect1[%f, %f]\n-obvod: %f\n-obsah: %f\n", rect1.a, rect1.b, rect1.cicruit(), rect1.area());
		System.out.printf("rect2[%f, %f]\n-obvod: %f\n-obsah: %f\n", rect2.a, rect2.b, rect2.cicruit(), rect2.area());
		System.out.printf("rect3[%f, %f]\n-obvod: %f\n-obsah: %f\n", rect3.a, rect3.b, rect3.cicruit(), rect3.area());
		
	}

}
