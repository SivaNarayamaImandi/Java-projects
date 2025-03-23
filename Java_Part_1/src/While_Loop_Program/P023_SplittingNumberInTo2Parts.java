package While_Loop_Program;

import java.util.Scanner;

public class P023_SplittingNumberInTo2Parts {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scanner.nextInt();
		int temp = num;
		int count=0;
		while(temp!=0)
		{
			count++;temp/=10;
		}
		if(count%2==0)
		{
			temp=num;
			int base=1;
			for(int i=1;i<=count/2;i++)
			{
				base*=10;
			}
			int fir=num/base;
			int last=num%base;
			System.out.println(fir);
			System.out.println(last);
		}
		else
		{
			System.out.println("Not  possible");
		}
		scanner.close();
	}
}
