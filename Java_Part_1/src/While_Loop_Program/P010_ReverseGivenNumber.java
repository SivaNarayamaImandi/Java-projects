package While_Loop_Program;

import java.util.Scanner;

public class P010_ReverseGivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		while (temp != 0) {
			rev = rev * 10 + temp % 10;
			temp /= 10;
		}
		System.out.println(rev);
		sc.close();
	}
}
