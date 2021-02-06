package in.co.rayss;

public class fivonacciseries {
	public static void main(String[] args) {
		int a = 0, b = 1;
		int c;
		int i = 2;
		int count = 10;
		for (i = 2; i <= count; i++) {
			c = a + b;
			System.out.println(" " + c);
			a = b;
			b = c;
		}
	}

}
