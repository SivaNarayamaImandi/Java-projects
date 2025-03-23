package Methods;

import java.util.Scanner;

public class SpyNumber {
	public static int sum(int n) {
		int temp = n;
		int sum = 0;
		while (temp != 0) {
			sum += temp % 10;
			temp /= 10;
		}
		return sum;
	}

	public static int pro(int n) {
		int pro = 1;
		int temp = n;
		while (temp != 0) {
			pro *= temp % 10;
			temp /= 10;
		}
		return pro;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (sum(n) == pro(n))
			System.out.println("spy");
		else
			System.out.println("not a spy");
		sc.close();
	}
}
