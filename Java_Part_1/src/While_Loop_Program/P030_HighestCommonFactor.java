package While_Loop_Program;

import java.util.Scanner;

public class P030_HighestCommonFactor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int x = scanner.nextInt();
		System.out.print("Enter 2nd number : ");
		int y = scanner.nextInt();
		int hcf = 0;
		int lcf = 0;
		for (int i = 1; i <= x && i <= y; i++) {
			if (x % i == 0 && y % i == 0) {
				if (i != 1) {
					lcf = i;
					break;
				}
			}
		}
		System.out.println(lcf);
		for (int i = 1; i <= x && i <= y; i++) {
			if (x % i == 0 && y % i == 0) {
				hcf = i;
			}
		}
		System.out.println(hcf);
		scanner.close();
	}
}
