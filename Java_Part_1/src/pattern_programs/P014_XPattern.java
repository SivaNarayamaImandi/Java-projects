package pattern_programs;

import java.util.Scanner;

public class P014_XPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows : ");
		int rows = sc.nextInt();
		System.out.print("Enter a symbol : ");
		char symbol = sc.next().charAt(0);
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				if (i == j || (i + j) == (rows + 1))
					System.out.print(" " + symbol + " ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
		sc.close();
	}
}
