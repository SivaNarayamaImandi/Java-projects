package While_Loop_Program;

import java.util.Scanner;

public class P006_SumOfFactorialsOfGivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int sum = 0;
		int temp = num;
		while (temp != 0) {
			int fact = 1;
			int ld = temp % 10;
			for (int i = 1; i <= ld; i++) {
				fact *= i;
			}
			sum += fact;
			temp /= 10;
		}
		System.out.println(sum);
		sc.close();
	}
}
