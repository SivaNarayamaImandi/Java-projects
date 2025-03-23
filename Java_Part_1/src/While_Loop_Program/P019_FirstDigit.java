package While_Loop_Program;

import java.util.Scanner;

public class P019_FirstDigit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scanner.nextInt();
		int first = 0;
		while (num != 0) {
			first = num % 10;
			num /= 10;
		}
		System.out.println(first);
		scanner.close();
	}
}
