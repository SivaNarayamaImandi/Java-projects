package While_Loop_Program;

import java.util.Scanner;

public class P007_ProductOfGivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int pro = 1;
		int temp = num;
		while (temp != 0) {
			pro *= temp % 10;
			temp /= 10;
		}
		System.out.println(pro);
		sc.close();
	}
}
