package While_Loop_Program;

import java.util.Scanner;

public class P022_BinaryToDecimal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a number : ");
		int num = scanner.nextInt();
		int temp = num;
		int sum = 0;
		int base = 1;
		int pro = 1;
		while (temp != 0) {
			int ld = temp % 10;
			pro = ld * base;
			base *= 2;
			temp /= 10;
			sum += pro;
		}
		System.out.println(sum);
		scanner.close();
	}
}
