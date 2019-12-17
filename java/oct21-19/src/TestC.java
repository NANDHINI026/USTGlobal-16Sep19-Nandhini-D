
public class TestC {
	public static void main(String[] args) {
		Cow c = new Cow();
		c.name = "Timon";
		c.color = "Yellow";
		System.out.println("cow name is " + c.name);
		System.out.println("cow name is " + c.color);
		c.eat();
		c.sleep();
		System.out.println("*********************");
		Cow c1 = new Cow();
		c1.name = "pumba";
		c1.color = "Blue";
		System.out.println("cow name is " + c1.name);
		System.out.println("cow name is " + c1.color);
		c.eat();
		c.sleep();
	}
}
