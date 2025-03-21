package standerd_programs;
import java.util.Scanner;
public class P007IfElseSimpleCalculator 
{
	public static void main(String[] args) 
	{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("=======================================");
			System.out.println("     WELCOME TO SIMPLE CALCULATOR");
			System.out.println("=======================================");
			System.out.println("Enter 1 for ADDITION");
			System.out.println("Enter 2 for SUBTRACTION");
			System.out.println("Enter 3 for MULTIPLICATION");
			System.out.println("Enter 4 for DIVISION (QUOTIENT)");
			System.out.println("Enter 5 for DIVISION (REMAINDER)");
			System.out.println("Enter 6 for EVEN/ODD");
			System.out.println("Enter 7 for POSITIVE/NEGATIVE");
			System.out.println("=======================================");
			
			System.out.print("Choose your option : ");
			int choose = sc.nextInt();
			
			if (choose==1)
			{
				System.out.println("Your choosen 1 option for ADDITION");
				System.out.println("Enter two numbers one by one");
				double a = sc.nextDouble();
				double b = sc.nextDouble();
				double sumOfTwoNumbers = a+b;
				System.out.println("Ans is : "+sumOfTwoNumbers);
			}
			else if (choose==2)
			{
				System.out.println("Your choosen 2 option for SUBTRACTION");
				System.out.println("Enter two numbers one by one");
				double a = sc.nextDouble();
				double b = sc.nextDouble();
				double sumOfTwoNumbers = a-b;
				System.out.println("Ans is : "+sumOfTwoNumbers);
			}
			else if (choose==3)
			{
				System.out.println("Your choosen 3 option for MULTIPLICATION");
				System.out.println("Enter two numbers one by one");
				double a = sc.nextDouble();
				double b = sc.nextDouble();
				double sumOfTwoNumbers = a*b;
				System.out.println("Ans is : "+sumOfTwoNumbers);
			}
			else if (choose==4)
			{
				System.out.println("Your choosen 4 option for DIVISION (QUOTIENT)");
				System.out.println("Enter two numbers one by one");
				double a = sc.nextDouble();
				double b = sc.nextDouble();
				double sumOfTwoNumbers = a/b;
				System.out.println("Ans is : "+sumOfTwoNumbers);
			}
			else if (choose==5)
			{
				System.out.println("Your choosen 5 option for DIVISION (REMAINDER)");
				System.out.println("Enter two numbers one by one");
				double a = sc.nextDouble();
				double b = sc.nextDouble();
				double sumOfTwoNumbers = a%b;
				System.out.println("Ans is : "+sumOfTwoNumbers);
			}
			else if (choose==6)
			{
				System.out.println("Your choosen 6 option for EVEN/ODD");
				System.out.println("Enter a numbers");
				double a = sc.nextDouble();
				double rem = a%2;
				if (rem==0)
				{
					System.out.println("EVEN");
				}
				else
				{
					System.out.println("ODD");
				}
			}
			else if (choose==7)
			{
				System.out.println("Your choosen 7 option for POSITIVE/NEGATIVE");
				System.out.println("Enter a numbers");
				double a = sc.nextDouble();
				if (a>0)
				{
					System.out.println("POSITIVE");
				}
				else if (a<0)
				{
					System.out.println("NEGATIVE");
				}
				else
				{
					System.out.println("NUETRAL");
				}
			}
			else
			{
				System.out.println("Entered option is invalid");
				System.out.println("Once refresh & enter valid option");
			}
			sc.close();
	}

}