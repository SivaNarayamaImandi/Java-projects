package While_Loop_Program;

import java.util.Scanner;

public class P025_TechNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scanner.nextInt();
		int temp = num;
		int count = 0;
		while (temp != 0) {
			count++;
			temp /= 10;
		}
		if (count % 2 == 0) {
			temp = num;
			int sum = 0;
			int base = 1;
			for (int i = 1; i <= count / 2; i++) {
				base *= 10;
			}
			int fir = num / base;
			int last = num % base;
			sum = fir + last;
			sum *= sum;
			// System.out.println((fir+last)*(fir+last));
			if (num == sum) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		} else {
			System.out.println("Can't possible");
		}
		scanner.close();
	}
}
