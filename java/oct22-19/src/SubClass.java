
public class SubClass extends SuperClass {
	String s = "subclass variable";

	SubClass() {
		System.out.println("Sub class Constructor");
	}

	void getData() {
		System.out.println(s);
		System.out.println(this.s);
		System.out.println(super.s);
		System.out.println("****************************");
		super.superClassMethod();
		superClassMethod();
	}
}
