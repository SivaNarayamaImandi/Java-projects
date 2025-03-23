package While_Loop_Program;

import java.util.Scanner;

public class P014_SumOfExpUsingGivenNumberCount {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scanner.nextInt();
		int temp = num;
		int count = 0;
		while (temp != 0) {
			count++;
			temp /= 10;
		}
		temp = num;
		int sum = 0;
		while (temp != 0) {
			int exp = 1;
			for (int i = 1; i <= count; i++) {
				exp *= temp % 10;
			}
			sum += exp;
			temp /= 10;
		}
		System.out.println(sum);
		scanner.close();
	}
}
