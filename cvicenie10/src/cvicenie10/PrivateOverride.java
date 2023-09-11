package cvicenie10;

//: c07:PrivateOverride.java
//Abstract classes and methods.
import com.bruceeckel.simpletest.*;

public class PrivateOverride {
	private static Test monitor = new Test();
	private void f() {
		System.out.println("private f()");
	}
	public static void main(String[] args) {
		PrivateOverride po = new Derived();		// upcasting
		po.f();
		monitor.expect(new String[] {
				"private f()"
		});
	}
}

class Derived extends PrivateOverride {
	public void f() {							// public f() prekonava private f()
		System.out.println("public f()");
	}
} ///:~
