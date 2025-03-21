package standerd_programs;
import java.util.Scanner;
public class P002IfElseStatementVotingEligibility 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		if (age>=18)
		{
			System.out.println("Your eligible for voting");
		}
		else
		{
			System.out.println("Your not eligible for voting");
		}
		sc.close();
	}

}