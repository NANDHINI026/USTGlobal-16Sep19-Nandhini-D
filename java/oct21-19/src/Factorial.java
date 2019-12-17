
public class Factorial {
	public static void main(String[] args) {
		int res = fact(6);
		System.out.println("res=" + res);
	}

	static int fact(int n) {
		if (n == 1 || n == 0)
			return 1;
		return n * fact(n - 1);
	}

}
