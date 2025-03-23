package While_Loop_Program;

import java.util.Scanner;

public class P005_SumOfEvenOrOddDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		long num = sc.nextLong();
		long temp = num;
		long sum = 0;
		while (temp != 0) {
			if ((temp % 10) % 2 == 0) {
				sum += temp % 10;
			}
//			if((temp%10)%2==1)
//			{
//				sum+=temp%10;
//			}
			temp /= 10;
		}
		System.out.println("Sum of even digits : " + sum);
//		System.out.println("Sum of odd digits : "+sum);
		sc.close();
	}
}
