package For_Loop_programs;

import java.util.Scanner;

public class P007_FactorOfAGivenNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.println("Finding factor from 1 to " + num);
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println("[ " + i + " ]");
			}
		}
		sc.close();
	}
}
