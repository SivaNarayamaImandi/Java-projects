package While_Loop_Program;

public class P032_FibonacciSeries {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + ". " + sum);
			a = b;
			b = sum;
			sum = a + b;
		}
	}
}
