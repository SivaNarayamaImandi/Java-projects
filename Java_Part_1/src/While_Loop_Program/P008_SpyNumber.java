package While_Loop_Program;

import java.util.Scanner;

public class P008_SpyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		int sum = 0;
		int pro = 1;
		while (temp != 0) {
			pro *= temp % 10;
			sum += temp % 10;
			temp /= 10;
		}
		if (sum == pro) {
			System.out.println("SPY number");
		} else {
			System.out.println("Not a SPY number");
		}
		sc.close();
	}
}
