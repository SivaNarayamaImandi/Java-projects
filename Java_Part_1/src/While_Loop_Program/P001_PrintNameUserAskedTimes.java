package While_Loop_Program;

import java.util.Scanner;

public class P001_PrintNameUserAskedTimes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name : ");
		String s = sc.next();
		System.out.print("Enter how many times you want : ");
		int times = sc.nextInt();
		while (1 <= times) {
			System.out.println(s);
			times--;
		}
		sc.close();
	}
}
