package string_programs;

import java.util.Scanner;

public class P001_ReverseString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s = sc.nextLine();
//		without using built in methods like string buffer & builder
		
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		
//		without using built in methods like string buffer & builder
//		StringBuffer sb=new StringBuffer(s);
//		System.out.println(sb.reverse());
		sc.close();
	}
}
