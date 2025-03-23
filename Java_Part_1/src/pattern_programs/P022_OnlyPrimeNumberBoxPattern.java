package pattern_programs;

import java.util.Scanner;

public class P022_OnlyPrimeNumberBoxPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a nmber : ");
		int x = sc.nextInt();
		System.out.print("Enter no of rows : ");
		int rows=sc.nextInt();
		System.out.print("Enter no of columns : ");
		int columns=sc.nextInt();
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= columns; j++) {
				while (true) {
					x++;
					int count = 0;
					for (int c = 1; c <= x; c++) {
						if (x % c == 0)
							count++;
					}
					if (count == 2) {
						System.out.print(" " + x + " ");
						break;
					}
				}
			}
			System.out.println();
		}
		sc.close();
	}
}
