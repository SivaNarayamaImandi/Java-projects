package While_Loop_Program;

public class P033_NonFibonacciSeries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			if (i != sum) {
				System.out.println(i);
			} else {
				sum = a + b;
				a = b;
				b = sum;
			}
		}
	}
}
