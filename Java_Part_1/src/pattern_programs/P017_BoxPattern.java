package pattern_programs;

import java.util.Scanner;

public class P017_BoxPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows : ");
		int rows = sc.nextInt();
		System.out.print("Enter no of columns : ");
		int columns = sc.nextInt();
		System.out.print("Enter symbol : ");
		char symbol = sc.next().charAt(0);
		System.out.println();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				if (i == 1 || j == 1 || j == columns || i == rows) {
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
