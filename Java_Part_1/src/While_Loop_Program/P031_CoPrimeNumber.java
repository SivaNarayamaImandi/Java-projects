package While_Loop_Program;

import java.util.Scanner;

public class P031_CoPrimeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		int x=sc.nextInt();
		System.out.print("Enter 2nd number : ");
		int y=sc.nextInt();
		int hcf=0;
		for(int i=1;i<=x&&i<=y;i++)
		{
			if(x%i==0&&y%i==0)
			{
				hcf=i;
			}
		}
		if(hcf==1)
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
		sc.close();
	}
}
