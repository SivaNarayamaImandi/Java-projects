package pattern_programs;

import java.util.Scanner;

public class P020_SolidTopRightTrianglePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter rows : ");
		int rows = sc.nextInt();
		System.out.print("Enter symbol : ");
		char symbol = sc.next().charAt(0);
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				if (j >= i) {
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
