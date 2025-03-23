package string_programs;

import java.util.Scanner;

public class GivenStringPalidrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.next();
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev += s.charAt(i);
		}
		if (s.equalsIgnoreCase(rev)) {
			System.out.println("Palidrom");
		} else {
			System.out.println("Not a Palidrom");
		}
		sc.close();
	}
}
