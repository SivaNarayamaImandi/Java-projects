package pattern_programs;

import java.util.Scanner;

public class P015_ZPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows : ");
		int rows = sc.nextInt();
		System.out.print("Enter a symbol : ");
		char symbol = sc.next().charAt(0);
		for (int i = 1; i <= rows; i++) {
			for (int j = rows; j >= 1; j--) {
				if (i == 1 || i == rows || i == j)
					System.out.print(" " + symbol + " ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		sc.close();
	}
}
