package cvicenie10;

//: c07:music:Music.java
//Inheritance & upcasting.
package c07.music;
import com.bruceeckel.simpletest.*;

public class Music {
	private static Test monitor = new Test();
	public static void tune(Instrument i) {
		// ...
		i.play(Note.MIDDLE_C);
	}
	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute); // Upcasting
		monitor.expect(new String[] {
				"Wind.play() Middle C"
		});
	}
} ///:~

