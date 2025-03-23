package While_Loop_Program;

import java.util.Scanner;

public class P018_PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int count = 0;
		int i = 1;
		while (i <= n) {
			if (n % i == 0) {
				count++;
			}
			i++;
		}
		if (count == 2)
			System.out.println("yes");
		else
			System.out.println("no");
		sc.close();
	}
}
