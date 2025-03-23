package practice_programs;

import java.util.Scanner;

public class PalidromString {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String string=scanner.next();
		String rev="";
		for (int i=string.length()-1;i>=0;i--) {
			char c = string.charAt(i);
			rev=rev+c;
		}
		if(string.equals(rev))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not a palindrom");
		}
		scanner.close();
	}
}
