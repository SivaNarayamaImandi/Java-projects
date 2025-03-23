package recursion_programs;

import java.util.Scanner;

public class PrimeNumber {
	static int i = 1;
	static int count = 0;

	static void prime(int n) {
		if (i > n) {
			if (count == 2) {
				System.out.println("prime");
			} else {
				System.out.println("no");
			}
		} else {
			if (n % i == 0) {
				count++;
			}
			i++;
			prime(n);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		prime(sc.nextInt());
		sc.close();
	}
}
