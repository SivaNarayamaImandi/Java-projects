package While_Loop_Program;

import java.util.Scanner;

public class P009_SpyNumberTillGivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int end = sc.nextInt();
		System.out.println("Enter a number you will get spy numbers b/w 1 to " + end);
		int sln = 1;
		for (int i = 1; i <= end; i++) {
			int temp = i;
			int sum = 0;
			int pro = 1;
			while (temp != 0) {
				pro *= temp % 10;
				sum += temp % 10;
				temp /= 10;
			}
			if (sum == pro) {
				System.out.println(sln + ". " + i);
				sln++;
			}
		}
		sc.close();
	}
}
