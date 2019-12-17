
public class Employee2 {
	String name;
	int eid;
	long aadharno;

	Employee2(String name, int eid, long aadharno) {
		this.name = name;
		this.eid = eid;
		this.aadharno = aadharno;
	}

	Employee2(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}

	Employee2(int eid, String name) {
		this.eid = eid;
		this.name = name;

	}

	void printDetails() {
		System.out.println("Hi " + name + " Welcome to UST Global");
	}
}
