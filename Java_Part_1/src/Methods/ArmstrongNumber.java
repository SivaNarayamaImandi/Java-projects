package Methods;

import java.util.Scanner;

public class ArmstrongNumber {
	public static int armstrong(int n, int c) {

		int temp = n;
		int sum = 0;
		while (temp != 0) {
			int exp = 1;
			for (int i = 1; i <= c; i++) {
				exp *= temp % 10;
			}
			sum += exp;
			temp /= 10;
		}
		return sum;
	}

	public static int count(int n) {
		int temp = n;
		int count = 0;
		while (temp != 0) {
			count++;
			temp /= 10;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (armstrong(n, count(n)) == n)
			System.out.println("armstrong");
		else
			System.out.println("not a armstrong");
		sc.close();
	}
}
