public class Employee1 {
	String name;
	int eid;

	Employee1(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}

	void details() {
		System.out.println("Name=" + name);
		System.out.println("Id=" + eid);
		this.sayHello();
	}

	void sayHello() {
		System.out.println("Hello " + name + " Welcome to Ust global Company");
	}

	public static void main(String[] args) {
		Employee1 e1 = new Employee1("Aadhitya", 143);
		e1.details();

		Employee1 e2 = new Employee1("Sendhil", 024);
		e2.details();
	}
}
