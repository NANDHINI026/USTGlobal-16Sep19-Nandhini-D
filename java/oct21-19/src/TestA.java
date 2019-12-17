
public class TestA {
	public static void main(String[] args) {
		Pen p = new Pen();
		p.cost = 100;
		p.color = "sky blue";
		p.brand = "cello";
		System.out.println("Cost is " + p.cost);
		System.out.println("Color is " + p.color);
		System.out.println("Brand is " + p.brand);
		p.write();
	}

}
