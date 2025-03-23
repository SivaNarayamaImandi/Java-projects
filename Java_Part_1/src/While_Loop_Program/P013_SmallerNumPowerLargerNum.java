package While_Loop_Program;

import java.util.Scanner;

public class P013_SmallerNumPowerLargerNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scanner.nextInt();
		int temp = num;
		int small = temp % 10;
		int large = temp % 10;
		while (temp != 0) {
			if (large < temp % 10) {
				large = temp % 10;
			} else if (small > temp % 10) {
				small = temp % 10;
			}
			temp /= 10;
		}
		int exp = 1;
		int sum=0;
		for (int i = 1; i <= large; i++) {
			exp *= small;
			sum+=exp;
		}
		System.out.println(exp);
		System.out.println(sum);
		scanner.close();
	}
}
