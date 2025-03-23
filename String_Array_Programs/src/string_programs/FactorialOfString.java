package string_programs;

import java.util.Scanner;

public class FactorialOfString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER A NUMBER : ");
		String s=sc.next();
		Integer x=Integer.valueOf(s);
		int fac=1;
		while(x!=0)
		{
			int ld=x%10;
			
			if(ld%2==0)
			{
				for(int i=1;i<=ld;i++)
				{
					fac*=i;
				}
			}
			x/=10;
		}
		System.out.println(fac);
		sc.close();
	}
}
