package While_Loop_Program;

import java.util.Scanner;

public class P024_MagicNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scanner.nextInt();
		int temp = num;
		while (temp > 9) {
			int sum = 0;
			while (temp != 0) {
				sum += temp % 10;
				temp /= 10;
			}
			temp = sum;
		}
		if (temp == 1) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		scanner.close();
	}
}
