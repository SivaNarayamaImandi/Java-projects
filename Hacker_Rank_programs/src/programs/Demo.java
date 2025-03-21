package programs;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner sc= new  Scanner(System.in);
		String s=sc.nextLine();
		int i=sc.nextInt();
		System.out.printf("%-15s%03d",s,i);
		sc.close(); 
	}
}
