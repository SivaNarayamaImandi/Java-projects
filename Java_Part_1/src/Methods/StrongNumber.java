package Methods;

import java.util.Scanner;

public class StrongNumber {
//145
	public static int strong(int n) {
		int temp = n;
		int sum = 0;
		while (temp != 0) {
			int fac = 1;
			int ld = temp % 10;
			for (int i = 1; i <= ld; i++) {
				fac *= i;
			}
			sum += fac;
			temp /= 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (strong(n) == n)
			System.out.println("Strong");
		else
			System.out.println("not a strong");
		sc.close();
	}
}
