package pattern_programs;

import java.util.Scanner;

public class P007_ColumnSameAlphabetsPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows : ");
		int rows = sc.nextInt();
		System.out.print("Enter start alphabet (A or a): ");
		char start = sc.next().charAt(0);
		System.out.println("----------To----------");
		System.out.print("Enter end alphabet (Z or z): ");
		char end = sc.next().charAt(0);
		for (int i = 1; i <= rows; i++) {
			for (char j = start; j <= end; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
