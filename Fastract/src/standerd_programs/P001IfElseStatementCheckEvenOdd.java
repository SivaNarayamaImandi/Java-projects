package standerd_programs;
import java.util.Scanner;
public class P001IfElseStatementCheckEvenOdd 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number : ");
		int a = sc.nextInt();
		int rem = a%2;
		if (rem==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
		sc.close();
	}

}