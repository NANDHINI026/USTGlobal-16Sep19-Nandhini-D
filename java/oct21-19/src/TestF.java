
public class TestF {
	public static void main(String[] args) {
		Student.cname = "Qspiders";
		Student s1 = new Student();
		s1.name = "Nandhini";
		s1.usn = 101;
		System.out.println("college name is=" + Student.cname);
		System.out.println("Name is=" + s1.name);
		System.out.println("Name is=" + s1.usn);
		Student s2 = new Student();
		s2.name = "Ananya";
		s2.usn = 102;
		System.out.println("college name is=" + Student.cname);
		System.out.println("Name is=" + s2.name);
		System.out.println("Name is=" + s2.usn);
	}
}
