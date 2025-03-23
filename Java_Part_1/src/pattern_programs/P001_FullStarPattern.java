package pattern_programs;

import java.util.Scanner;

public class P001_FullStarPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean start = true;
		while (start) {
			System.out.println("Enter 1 for symbol pattren\nEnter 2 for string pattern\nEnter 3 for Exit");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.print("Enter a symbol : ");
				char symbol = sc.next().charAt(0);
				for (int i = 1; i <= 5; i++) {
					for (int j = 1; j <= 5; j++) {
						System.out.print(" " + symbol + " ");
					}
					System.out.println();
				}
			} else if (choice == 2) {
				System.out.print("Enter name : ");
				String symbol = sc.next();
				for (int i = 1; i <= 5; i++) {
					for (int j = 1; j <= 5; j++) {
						System.out.print(" " + symbol + " ");
					}
					System.out.println();
				}
			} else if (choice == 3) {
				start = false;
				System.out.println("Thank you for visiting.......");
			} else {
				System.out.println("enter valid option try again......\n");
				System.out.println("Enter 1 for continue\nEnter any number for exit");
				int i = sc.nextInt();
				if (i == 1) {
					start = true;
				} else {
					start = false;
					System.out.println("Thank you for visiting.......");
				}
			}
		}
		sc.close();
	}
}
