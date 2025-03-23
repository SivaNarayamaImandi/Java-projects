package For_Loop_programs;

import java.util.Scanner;

public class P010_PerfectFactors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0)
				sum += i;
		}
		if (sum == num)
			System.out.println("Perfect Factor");
		else
			System.out.println("Not a perfect factor");
		sc.close();
	}
}
