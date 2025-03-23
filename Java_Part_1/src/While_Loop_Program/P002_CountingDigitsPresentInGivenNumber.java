package While_Loop_Program;

import java.util.Scanner;

public class P002_CountingDigitsPresentInGivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to count number of digits : ");
		long num = sc.nextLong();
		int count = 0;
		while (num != 0) {
			num /= 10;
			count++;
		}
		System.out.println("No of digits present in given number : " + count);
		sc.close();
	}
}
