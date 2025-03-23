package string_programs;

import java.util.Scanner;

public class P004_RevStringEachWordWithoutUsingSplitAndWithoutChangingItsPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		String reverse = "";
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			int startIndex = i;
			while (s.charAt(startIndex) != ' ' && startIndex < s.length()) {
				s1 = s1 + s.charAt(startIndex);
				startIndex++;
				if (startIndex == s.length())
					break;
			}
			i = startIndex;
			String rev = "";
			for (int j = s1.length() - 1; j >= 0; j--) {
				rev += s1.charAt(j);
			}
			reverse = reverse + rev + " ";
			s1 = "";
		}
		System.out.println();
		System.out.println(reverse);
		sc.close();
	}
}
