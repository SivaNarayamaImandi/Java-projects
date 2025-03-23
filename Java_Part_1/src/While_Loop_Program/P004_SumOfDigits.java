package While_Loop_Program;

import java.util.Scanner;

public class P004_SumOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		long num = sc.nextLong();
		long temp = num;
		long sum = 0;
		while (temp != 0) {
			sum += temp % 10;
			temp /= 10;
		}
		System.out.println("Sum of given number is : " + sum);
		sc.close();
	}
}
