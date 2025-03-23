package For_Loop_programs;

import java.util.Scanner;

public class P016_PrimeNumWTRslnNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int sln = 1;
		for (int x = 1; sln <= num; x++) {
			int count = 0;
			for (int i = 1; i <= x; i++) {
				if (x % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				if (sln == num) {
					System.out.println(sln + ". " + x);
				}
				sln++;
			}
		}
		sc.close();
	}
}
