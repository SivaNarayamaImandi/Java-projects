package string_programs;

import java.util.Scanner;

public class P002_RevEachWordInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		String[] split = s.split(" ");
//		without using built in methods like string buffer & builder

		for (String string : split) {
			for (int i = string.length() - 1; i >= 0; i--) {
				System.out.print(string.charAt(i));
			}
			System.out.print(" ");
		}

//		without using built in methods like string buffer & builder

//		for (String string : split) {
//			StringBuffer sb = new StringBuffer(string);
//			System.out.println(sb.reverse());
//		}
		sc.close();
	}
}
