package While_Loop_Program;

import java.util.Scanner;

public class P003_PrintDigitByDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		long num = sc.nextLong();
		while (num != 0) {
			System.out.println(num % 10);
			num /= 10;
		}
		sc.close();
	}
}
