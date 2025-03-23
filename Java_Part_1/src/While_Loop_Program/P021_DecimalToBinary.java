package While_Loop_Program;

import java.util.Scanner;

public class P021_DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int base = 1;
		int pro = 1;
		while (temp != 0) {
			int ld = temp % 2;
			pro = ld * base;
			base *= 10;
			temp /= 2;
			sum += pro;
		}
		System.out.println(sum);
		sc.close();
	}
}
