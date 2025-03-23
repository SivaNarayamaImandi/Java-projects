package string_programs;

import java.util.Scanner;

public class SumOfStringNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s= sc.next();
		Integer i=Integer.valueOf(s);
		int sum=0;
		while(i!=0)
		{
			int ld=i%10;
			sum+=ld;
			i/=10;
		}
		System.out.println(sum);
		sc.close();
	}
}
