
public class TestB {
		static int a;
		int b;
		 {
			a = 10;
			b=20;
			System.out.println("non Static block 1");
		}
				public static void main(String[] args) {
			TestB a = new TestB();
			TestB b = new TestB();

			System.out.println("Main Method");
		}
	    {
			a = 10;
			System.out.println(" non Static block 2");
		}

		}


