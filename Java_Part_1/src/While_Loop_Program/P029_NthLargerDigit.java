package While_Loop_Program;

import java.util.Scanner;

public class P029_NthLargerDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.print("Enter nth number : ");
		int n = sc.nextInt();
		int temp = num;
		while (temp != 0) {
			int count = 0;
			int temp1 = num;
			int ld1 = temp % 10;
			while (temp1 != 0) {
				int ld = temp1 % 10;
				if (ld > ld1) {
					count++;
				}
				temp1 /= 10;
			}
			if (count == n - 1) {
				System.out.println(ld1);
				break;
			}
			temp /= 10;
		}
		sc.close();
	}
}
