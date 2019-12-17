
public class TestE {

	public static void main(String[] args) {
		Btm b = new Btm();
		Btm b1 = new Btm();
		b.swipe();
		b1.swipe();
		int count = b.getCount();
		System.out.println("Count is =" + count);
		int totalcount = b.getCount();
		System.out.println("TotalCount is =" + totalcount);

	}

}
