package For_Loop_programs;

import java.util.Scanner;

public class P018_Exponantial {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter Power value : ");
		int power=sc.nextInt();
		System.out.print("Enter Base value : ");
		int base=sc.nextInt();
		int exponantial=1;
		for(int i=1;i<=power;i++)
		{
			exponantial*=base;
		}
		System.out.println("\nExponantial is: "+exponantial);
		sc.close();
	}
}
