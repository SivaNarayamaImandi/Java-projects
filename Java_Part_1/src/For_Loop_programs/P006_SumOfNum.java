package For_Loop_programs;

import java.util.Scanner;

public class P006_SumOfNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter starting number : ");
		int start = sc.nextInt();
		System.out.print("Enter ending number : ");
		int end = sc.nextInt();
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += i;
		}
		System.out.println(sum);
		sc.close();
	}
}
