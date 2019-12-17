
public class TestB {
	public static void main(String[] args) {
		Van v = new Van();
		v.cost = 1000000;
		v.color = "blue";
		System.out.println("Van cost is" + v.cost);
		System.out.println("Van color is" + v.color);
		v.move();

		Van v1 = new Van();
		v1.cost = 300000;
		v1.color = "Violet";
		System.out.println("Van cost is" + v1.cost);
		System.out.println("Van color is" + v1.color);
		v.move();
	}
}
