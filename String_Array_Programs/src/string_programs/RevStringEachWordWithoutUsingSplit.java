package string_programs;

import java.util.Scanner;

public class RevStringEachWordWithoutUsingSplit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		String reverse = "";
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			int startIndex = i;
			// ' ' -> is used for break one by one word
			while (s.charAt(startIndex) != ' ' && startIndex < s.length()) {
				s1 = s1 + s.charAt(startIndex);
				startIndex++;
				if (startIndex == s.length()) {
					break; // if given string length is same as index it will break
				}
			}
			i = startIndex; // i -> is intialize to 1st word ending index
			// s1 -> is stores 1st word
			String rev = "";
			for (int j = s1.length() - 1; j >= 0; j--) {
				rev += s1.charAt(j);
			}
			reverse = reverse + rev + " "; // adding one by one word
			s1 = ""; // reinitializing s1 with empty string
		}
		System.out.println();
		System.out.println(reverse);
		sc.close();
	}
}
