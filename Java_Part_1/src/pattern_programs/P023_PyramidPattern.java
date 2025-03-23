package pattern_programs;

import java.util.Scanner;

public class P023_PyramidPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter spaces(best for 4) : ");
		int spaces = sc.nextInt();
		System.out.print("Enter stars(best for 1) : ");
		int star = sc.nextInt();
		System.out.print("Enter no of rows(best for 5) : ");
		int rows = sc.nextInt();
		System.out.print("Enter symbol : ");
		char symbol = sc.next().charAt(0);
		for (int i = 1; i <= rows; i++) {
			for (int s = 1; s <= spaces; s++) {
				System.out.print("   ");
			}
			for (int s1 = 1; s1 <= star; s1++) {
				System.out.print(" " + symbol + " ");
			}
			spaces--;
			star += 2;
			System.out.println();
		}
		sc.close();
	}
}
