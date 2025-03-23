package For_Loop_programs;

import java.util.Scanner;

public class P004_UserNameUserAskedTime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = sc.next();
		System.out.print("Enter how many times you want to print : ");
		int times = sc.nextInt();
		for (int i = 1; i <= times; i++)
			System.out.println(i + ". " + name);
		sc.close();
	}
}
