package standerd_programs;

import java.util.Scanner;

public class IfElseProgram01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("1. For age\n2. For name\n3. For Value");
		int i = sc.nextInt();
		switch (i) {
		case 1:
			System.out.println("enter your age");
			int j = sc.nextInt();
			System.out.println(j);
			break;

		case 2:
			System.out.println("Enter your name ");
			System.out.println(sc.next());
			break;

		case 3:
			System.out.println("Enter value");
			System.out.println(sc.nextInt());
			break;

		default:
			System.out.println("invalid option....");
			break;
		}
		sc.close();
	}
}

/*
 * Marks don't take above 100 and below 0 --> give valid marks 90-100--> A
 * 80-89--> B 60-79--> C 35-59--> D
 */

/*
 * bill morethan 10000 20% below 10000 4% Your Total bill is .....
 * 10000-10000*20% 10000-2000=8000 1000*4%=960
 */