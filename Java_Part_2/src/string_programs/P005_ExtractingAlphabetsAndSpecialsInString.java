package string_programs;

import java.util.Scanner;

public class P005_ExtractingAlphabetsAndSpecialsInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
//			alphabets
			if (Character.isAlphabetic(s.charAt(i)))
				System.out.print(s.charAt(i) + " ");

//			numbers 
//			if (Character.isDigit(s.charAt(i)))
//				System.out.print(s.charAt(i) + " ");
//			without using inbuilt methods
//			if (!((s.charAt(i) >= 48 && s.charAt(i) <= 57) || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
//					|| (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))) 
//				System.out.println(s.charAt(i));
		
//			special characters
//			if (!(Character.isAlphabetic(s.charAt(i)) && !Character.isDigit(s.charAt(i))))
//				System.out.print(s.charAt(i) + " ");
//			without using inbuilt methods
//			if (!((s.charAt(i) >= 48 && s.charAt(i) <= 57) || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
//					|| (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))) 
//				System.out.println(s.charAt(i));
		}
		sc.close();
	}
}
