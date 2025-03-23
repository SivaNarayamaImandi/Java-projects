package For_Loop_programs;

import java.util.Scanner;

public class P009_CountFactorOfAGivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("Count of factors from 1 to " + num);
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
