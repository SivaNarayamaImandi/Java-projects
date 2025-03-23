package For_Loop_programs;

import java.util.Scanner;

public class P017_NextPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number will get next prime number : ");
		int num = sc.nextInt();
		for (; true; num++) {
			int count = 0;
			for (int i = 1; i <= num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(num);
				break;
			}
			sc.close();
		}
	}
}
