package While_Loop_Program;

import java.util.Scanner;

public class P026_AutomorphicNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ENTER A NUMBER : ");
		int num = scanner.nextInt();
		int temp = num;
		int count = 0;
		int sq = num * num;
		while (temp != 0) {
			count++;
			temp /= 10;
		}
		int base = 1;
		for (int i = 1; i <= count; i++) {
			base *= 10;
		}
		if (sq % base == num) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
		scanner.close();
	}
}
