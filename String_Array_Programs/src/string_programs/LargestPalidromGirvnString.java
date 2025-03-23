package string_programs;

import java.util.Scanner;

public class LargestPalidromGirvnString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		String[] split = s.split(" ");
		String largest = "";
		for (int i = 0; i < split.length; i++) {
			if (PalidromString.palidrom(split[i])) {
				if (split[i].length() >= largest.length()) {
					largest = split[i];
				}
			}
		}
		System.out.println(largest);
		sc.close();
	}
}
