package pattern_programs;

import java.util.Scanner;

public class P026_RightPyramidPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows (recommended 9) : ");
		int rows = sc.nextInt();
		System.out.print("Enter no of spaces (recommended 4) : ");
		int space = sc.nextInt();
		System.out.print("Enter after spaces no of symbol (recommended 1) : ");
		int noOfStars = sc.nextInt();
		System.out.print("Enter sysmbol : ");
		char star = sc.next().charAt(0);

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("   ");
			}
			for (int k = 1; k <= noOfStars; k++) {
				System.out.print(" " + star + " ");
			}
			if (i <= 4) {
				space--;
				noOfStars++;
			} else {
				space++;
				noOfStars--;
			}
			System.out.println();
		}
		sc.close();
	}
}
