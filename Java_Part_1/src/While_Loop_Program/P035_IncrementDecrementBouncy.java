package While_Loop_Program;

import java.util.Scanner;

public class P035_IncrementDecrementBouncy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int cd = 10;
		int temp = num;
		boolean isInc = true;
		while (temp != 0) {
			if (temp % 10 <= cd) {
				cd = temp % 10;
			} else {
				isInc = false;
				break;
			}
			temp /= 10;
		}
		temp = num;
		cd = 0;
		boolean isDec = true;
		while (temp != 0) {
			if (temp % 10 >= cd) {
				cd = temp % 10;
			} else {
				isDec = false;
				break;
			}
			temp /= 10;
		}
		if (isInc)
			System.out.println("inc");
		else if (isDec)
			System.out.println("dec");
		else
			System.out.println("bouncy");
		sc.close();
	}
}
