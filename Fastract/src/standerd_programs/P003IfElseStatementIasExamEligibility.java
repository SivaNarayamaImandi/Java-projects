package standerd_programs;
import java.util.Scanner;
public class P003IfElseStatementIasExamEligibility 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		if (age>=21&&age<=32)
		{
			System.out.println("Eligible for IAS exam");
		}
		else
		{
			System.out.println("Not Eligible for IAS exam");
		}
		sc.close();
	}

}