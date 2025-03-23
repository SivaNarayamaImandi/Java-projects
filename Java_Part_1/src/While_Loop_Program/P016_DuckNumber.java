package While_Loop_Program;

import java.util.Scanner;

public class P016_DuckNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scanner.nextInt();
		int temp = num;
		boolean isDuck = true;
		while (temp != 0) {
			if (0 == temp % 10) {
				isDuck = false;
				break;
			}
			temp /= 10;
		}
		if (!isDuck)
			System.out.println("yes");
		else
			System.out.println("no");
		scanner.close();
	}
}
