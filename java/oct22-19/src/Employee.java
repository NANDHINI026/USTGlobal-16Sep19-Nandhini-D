
public class Employee {
	String name;
	int eid;

	Employee(String pname, int pid) {
		name = pname;
		eid = pid;
	}

	void details() {
		System.out.println("Name=" + name);
		System.out.println("Id=" + eid);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("Aadhitya", 143);
		Employee e2 = new Employee("Sendhil", 024);

		e1.details();
		e2.details();
	}
}
