package Methods;

import java.util.Scanner;

public class PalindromNumber {
	public static int palindrom(int n) {
		int temp = n;
		int rev = 0;
		while (temp != 0) {
			rev = rev * 10 + temp % 10;
			temp /= 10;
		}
		return rev;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (palindrom(n) == n)
			System.out.println("palindrom");
		else
			System.out.println("not a palindrom");
		sc.close();
	}
}
