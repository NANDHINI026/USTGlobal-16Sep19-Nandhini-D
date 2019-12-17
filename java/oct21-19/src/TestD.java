
public class TestD {
	public static void main(String[] args) {
		Person.color = "white";
		Person.walk();
		System.out.println("Person color =" + Person.color);
		Person p1 = new Person();
		p1.age = 21;
		p1.name = "Nandhini";
		System.out.println("Person color =" + p1.age);
		System.out.println("Person color =" + p1.name);
		p1.eat();
		p1.sleep();
		System.out.println("====================================");
		Person p2 = new Person();
		p2.age = 13;
		p2.name = "SendhilKumar";
		System.out.println("Person color =" + p2.age);
		System.out.println("Person color =" + p2.name);
		p2.eat();
		p2.sleep();
	}
}
