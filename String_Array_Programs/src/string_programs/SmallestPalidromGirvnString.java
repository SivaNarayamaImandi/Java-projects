package string_programs;

import java.util.Scanner;

public class SmallestPalidromGirvnString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		String[] split = s.split(" ");
		String smallest = split[0];
		for (int i = 0; i < split.length; i++) {
			if (PalidromString.palidrom(split[i])) {
				if (smallest.length() >= split[i].length()) {
					smallest = split[i];
				}
			}
		}
		System.out.println(smallest);
		sc.close();
	}
}
