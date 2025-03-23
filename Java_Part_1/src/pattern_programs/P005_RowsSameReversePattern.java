package pattern_programs;

import java.util.Scanner;

public class P005_RowsSameReversePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no of rows : ");
		int rows = sc.nextInt();
		System.out.print("Enter no of columns : ");
		int columns = sc.nextInt();
		for (int i = rows; i >= 1; i--) {
			for (int j = 1; j <= columns; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
