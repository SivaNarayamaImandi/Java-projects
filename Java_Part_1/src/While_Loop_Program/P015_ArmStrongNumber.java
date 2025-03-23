package While_Loop_Program;

import java.util.Scanner;

public class P015_ArmStrongNumber {
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
		if (sum == num)
			System.out.println("yes");
		else
			System.out.println("no");
		scanner.close();
	}
}
