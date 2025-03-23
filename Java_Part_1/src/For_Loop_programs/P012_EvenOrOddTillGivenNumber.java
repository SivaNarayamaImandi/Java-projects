package For_Loop_programs;

import java.util.Scanner;

public class P012_EvenOrOddTillGivenNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0)
				System.out.println(i + " ");
//			if (i % 2 == 1)
//				System.out.println(i + " ");
		}
		sc.close();
	}
}
