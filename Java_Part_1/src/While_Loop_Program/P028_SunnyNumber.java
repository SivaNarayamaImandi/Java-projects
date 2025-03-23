package While_Loop_Program;

import java.util.Scanner;

public class P028_SunnyNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scanner.nextInt();
		int temp = num + 1;
		boolean isTrue = false;
		for (int i = 1; i <= num; i++) {
			if (i * i == temp) {
				isTrue = true;
			}
		}
		if (isTrue)
			System.out.println("yes");
		else
			System.out.println("no");
		scanner.close();
	}
}
