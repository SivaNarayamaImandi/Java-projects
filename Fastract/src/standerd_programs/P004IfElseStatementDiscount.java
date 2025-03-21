package standerd_programs;
import java.util.Scanner;
public class P004IfElseStatementDiscount 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("================================");
		System.out.println("          BAHUBALI Shop");
		System.out.println("================================");
		System.out.print("Enter your bill amount : ");
		double bill = sc.nextDouble();
		if (bill>=10000)
		{
			System.out.println("Final bill is : "+(0.88)*bill);
		}
		else
		{
			System.out.println("Final bill is : "+(0.96)*bill);
		}
		sc.close();
	}

}
// bill morethan 10000 20% below 10000 4%