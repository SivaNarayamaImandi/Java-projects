package standerd_programs;
import java.util.Scanner;
public class P005IfElseAdvancedDiscount 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=========================");
		System.out.println("   Apple mobile shop");
		System.out.println("=========================");
		
		System.out.print("Enter bill amount : ");
		double bill = sc.nextDouble();
		System.out.println("You will get 20% off on your purchase");
		bill = bill*0.8;
		System.out.println("Your final bill amount is : "+bill);
		
		System.out.println("are you our regular customer? if yes enter treu otherwise false");
		boolean isRegular = sc.nextBoolean();
		
		if (isRegular==true)
		{
			System.out.println("Please enter your unique pin");
			int code = sc.nextInt();
			
			if (code==1234)
			{
				System.out.println("Yes your our regular customer.");
				System.out.println("so you will get extra 10% off on your final bill");
				System.out.println("Your finall bill amount is : "+bill*0.9);
				System.out.println("THANK YOU...... VISIT AGAIN......");
			}
			else
			{
				System.out.println("Entered pin is incorrect");
				System.out.println("Your final bill amount is : "+bill);
				System.out.println("THANK YOU...... VISIT AGAIN......");
				
			}
		}
		else
		{
			System.out.println("THANK YOU...... VISIT AGAIN......");
		}
		sc.close();
	}

}
// 20% on every bill, extra 10% for regular customer 