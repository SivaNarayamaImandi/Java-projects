package Methods;

import java.util.Scanner;

public class PrimeNumber {
	public static int prime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (prime(sc.nextInt()) == 2)
			System.out.println("prime");
		else
			System.out.println("not a prime");
		sc.close();
	}
}
