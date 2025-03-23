package While_Loop_Program;

import java.util.Scanner;

public class P017_BuzzNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scanner.nextInt();
		if (num % 10 == 7 || num % 7 == 0)
			System.out.println("yes");
		else
			System.out.println("no");
		scanner.close();
	}
}
