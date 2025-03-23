package While_Loop_Program;

import java.util.Scanner;

public class P012_LargestDigit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scanner.nextInt();
		int temp = num;
		int largest = temp % 10;
		int smallest = temp % 10;
		while (temp != 0) {
			if (largest < temp % 10) {
				largest = temp % 10;
			}
			if (smallest > temp % 10) {
				smallest = temp % 10;
			}
			temp /= 10;
		}
		System.out.println(largest);
		System.out.println(smallest);
		scanner.close();
	}
}
