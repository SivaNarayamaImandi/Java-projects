package pattern_programs;

import java.util.Scanner;

public class P006_Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows : ");
		int rows = sc.nextInt();
		System.out.print("Enter no of columns : ");
		int columns = sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = columns; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
