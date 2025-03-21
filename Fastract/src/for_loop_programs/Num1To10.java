package for_loop_programs;

import java.util.Scanner;

public class Num1To10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter How Many Times You Want : ");
		int i=sc.nextInt();
		System.out.print("Enter Your Name : ");
		String name=sc.next();
		for(int j=1;j<=i;j++)
		{
			System.out.println(name);
		}
		sc.close();
	}
}
