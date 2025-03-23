package While_Loop_Program;

import java.util.Scanner;

public class P027_HappyNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scanner.nextInt();
		int temp = num;
		do {
			int sum = 0;
			while (temp != 0) {
				int ld = temp % 10;// 2,3
				ld *= ld;
				sum += ld;// 4,9=13
				temp /= 10;// 3,0
			}
			temp = sum;// 13
		} while (temp > 9);
		if (temp == 1) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		scanner.close();
	}
}
