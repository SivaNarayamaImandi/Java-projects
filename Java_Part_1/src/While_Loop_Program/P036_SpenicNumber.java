package While_Loop_Program;

import java.util.Scanner;

public class P036_SpenicNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int pro = 1;
		int primeFact = 0;
		for (int x = 1; x <= n; x++) {
			if (n % x == 0) {
				int count = 0;
				for (int i = 1; i <= x; i++) {
					if (x % i == 0) {
						count++;
					}
				}
				if (count == 2) {
					primeFact++;
					pro *= x;
				}
			}
		}
		if (pro == n && (primeFact == 3))
			System.out.println("yes");
		else
			System.out.println("no");
		sc.close();
	}
}
