package pattern_programs;

import java.util.Scanner;

public class P018_SolidLeftTrianglePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows and columns : ");
		int rows = sc.nextInt();
		System.out.print("Enter symbol : ");
		char symbol = sc.next().charAt(0);
		System.out.println();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				if (i >= j) {
					System.out.print(" " + symbol + " ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
