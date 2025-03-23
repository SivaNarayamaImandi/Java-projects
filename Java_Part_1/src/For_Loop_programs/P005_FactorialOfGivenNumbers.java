package For_Loop_programs;

import java.util.Scanner;

public class P005_FactorialOfGivenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int fact = 1;
		for (int i = 1; i <= num; i++)
			fact *= i;
		System.out.println(fact);
		sc.close();
	}
}
