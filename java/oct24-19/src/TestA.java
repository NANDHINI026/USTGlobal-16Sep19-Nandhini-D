
public class TestA {
static int a;
int b;
static {
	a = 10;
	System.out.println("Static block 1");
}
TestA(){
	System.out.println("Constructor testA");
}
public static void main(String[] args) {
	TestA a = new TestA();
	System.out.println("Main Method");
}
static {
	a = 10;
	System.out.println("Static block 2");
}

}
