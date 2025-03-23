package practice_programs;

import java.util.Scanner;

public class ReplaceString {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("ENTER A STRING : ");
		String s=scanner.next();
		
		System.out.print("ENTER REPLACE CHARACTER : ");
		char rep=scanner.next().charAt(0);
		
		String r="";
		
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(c==rep)
			{
				c='S';
			}
			r+=c;
		}
		System.out.println(r);
		scanner.close();
	}
}
