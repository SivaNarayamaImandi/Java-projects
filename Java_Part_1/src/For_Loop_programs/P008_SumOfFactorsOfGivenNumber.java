package For_Loop_programs;

import java.util.Scanner;

public class P008_SumOfFactorsOfGivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("Sum of factors from 1 to " + num);
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
