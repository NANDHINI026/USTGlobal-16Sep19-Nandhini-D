
public class Person {
	String name;
	int age;

	Person(String pname, int page) {
		name = pname;
		age = page;
	}

	public static void main(String[] args) {
		Person p = new Person("Nandhini", 21);
		Person p1 = new Person("Kirshnan", 25);
		System.out.println(p.name);
		System.out.println(p.name);
	}
}
