package standerd_programs;
import java.util.Scanner;
public class P006ElseIfStatementGradeResult 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your grade : ");
		char grade = sc.next().charAt(0);
		
		if (grade=='A'||grade=='a')
		{
			System.out.println("You got FIRST RANK");
		}
		else if (grade=='B'||grade=='b')
		{
			System.out.println("You got SECOND RANK");
		}
		else if (grade=='C'||grade=='c')
		{
			System.out.println("You got First Class");
		}
		else if (grade=='D'||grade=='d')
		{
			System.out.println("You got Second Class");
		}
		else if (grade=='E'||grade=='e')
		{
			System.out.println("You got just passed");
		}
		else if (grade=='F'||grade=='f')
		{
			System.out.println("You got failed");
		}
		else
		{
			System.out.println("You have Entered invalid character");
			System.out.println("Please refresh & Enter valid character");
		}
		sc.close();
	}

}