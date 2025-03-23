package For_Loop_programs;

import java.util.Scanner;

public class P014_PrimeNumbersBeforeGivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		for (int x = 1; x <= num; x++) {
			int count = 0;
			for (int i = 1; i <= x; i++) {
				if (x % i == 0)
					count++;
			}
			if (count == 2)
				System.out.println(x);
		}
		sc.close();
	}
}
