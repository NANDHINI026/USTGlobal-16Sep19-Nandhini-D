
public class Student {
	String name;
	int rollno;
	final String cname = "Qspiders";
	final int cid;
	Student(){
		this.cid =200;
	}
	
	Student(String name,int rollno,int cid){
		this.name = name;
		this.rollno = rollno;
		this.cid = cid;
	}
	
	final void printDetails() {
		System.out.println("Hi "+name+" welcome to "+ cname);
	}
	final void printDetails(String name) {
		System.out.println("Hi "+name+" welcome to "+ cname);
	}
}
