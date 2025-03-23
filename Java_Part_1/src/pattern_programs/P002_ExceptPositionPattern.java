package pattern_programs;

import java.util.Scanner;

public class P002_ExceptPositionPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows : ");
		int rows = sc.nextInt();
		System.out.print("Enter no of columns : ");
		int columns = sc.nextInt();
		System.out.print("Enter no of symbole : ");
		char symbol = sc.next().charAt(0);
		System.out.print("Enter symbole posithion row and colum one by one : ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				if (j == c && i == r) {
					System.out.print(" " + symbol + " ");
				} else {
					System.out.print(" * ");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
