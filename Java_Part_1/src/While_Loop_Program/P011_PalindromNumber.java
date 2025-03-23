package While_Loop_Program;

import java.util.Scanner;

public class P011_PalindromNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scanner.nextInt();
		int temp = num;
		int rev = 0;
		while (temp != 0) {
			rev = rev * 10 + temp % 10;
			temp /= 10;
		}
		if (rev == num) {
			System.out.println("Palindrom");
		} else {
			System.out.println("Not a palindrom");
		}
		scanner.close();
	}
}
