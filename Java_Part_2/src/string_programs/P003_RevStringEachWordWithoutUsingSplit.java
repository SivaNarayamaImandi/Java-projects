package string_programs;

import java.util.Scanner;

public class P003_RevStringEachWordWithoutUsingSplit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		String rev = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			{
				if (c == ' ') {
					rev = c + rev;
				} else {
					rev = c + rev;
				}
			}
		}
		System.out.println(rev);
		sc.close();
	}
}
