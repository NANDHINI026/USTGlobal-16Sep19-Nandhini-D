
public class Student {
	String name;
	static String college = "Institute of road and transport technology";
	int rollno;
	String branch;
	long mobileno;

	Student(String name, int rollno, String branch, long mobileno) {
		this.name = name;
		this.rollno = rollno;
		this.branch = branch;
		this.mobileno = mobileno;
	}

	void printDetails() {
		System.out.println("Student Name=" + name);
		System.out.println("College Name=" + Student.college);
		System.out.println("Student Rollno=" + rollno);
		System.out.println("Student Branch=" + branch);
		System.out.println("Student Mobileno=" + mobileno);
	}

	public static void main(String[] args) {
		Student s1 = new Student("Nandhini", 026, "ECE", 978695048);
		s1.printDetails();
		System.out.println("==================================");
		Student s2 = new Student("Priya", 031, "CSE", 709458820);
		s2.printDetails();
		System.out.println("==================================");
		Student s3 = new Student("Manogari", 024, "Civil", 944456789);
		s3.printDetails();
		System.out.println("==================================");
		Student s4 = new Student("Gayathri", 012, "MECH", 978612749);
		s4.printDetails();
		System.out.println("==================================");
		Student s5 = new Student("Pooja", 026, "AUTOMOBILE", 978612748);
		s5.printDetails();
		System.out.println("==================================");
		Student s6 = new Student("Vinaya", 026, "IT", 63876589);
		s6.printDetails();
		System.out.println("==================================");
		Student s7 = new Student("Vithya", 026, "EEE", 978695048);
		s7.printDetails();
		System.out.println("==================================");
		Student s8 = new Student("Maha", 026, "PRODUCTION", 978695048);
		s8.printDetails();
		System.out.println("==================================");
		Student s9 = new Student("Thamaiyanthee", 026, "ECE", 978695048);
		s9.printDetails();
		System.out.println("==================================");
		Student s10 = new Student("Mohana", 026, "ECE", 978695048);
		s10.printDetails();
		System.out.println("==================================");
	}
}
