package pattern_programs;

import java.util.Scanner;

public class P012_NPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows : ");
		int rows = sc.nextInt();
		System.out.print("Enter a symbol : ");
		char symbol = sc.next().charAt(0);
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				if (j == 1 || j == rows || i == j) {
					System.out.print(" " + symbol + " ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
