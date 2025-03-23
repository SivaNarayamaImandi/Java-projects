package string_programs;

import java.util.Scanner;

public class FactorsOfString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A NUMBER : ");
		String s = sc.next();
		Integer x = Integer.valueOf(s);
		while (x != 0) {
			int ld = x % 10;
			for (int i = 1; i <= ld; i++) {
				if (ld % i == 0) {
					System.out.println(i);
				}
			}
			x/=10;
		}
		sc.close();
	}
}
