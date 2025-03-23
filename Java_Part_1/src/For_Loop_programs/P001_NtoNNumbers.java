package For_Loop_programs;

import java.util.Scanner;

public class P001_NtoNNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start number : ");
		int start = sc.nextInt();
		System.out.println("Enter end number : ");
		int end = sc.nextInt();
		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}
		sc.close();
	}
}
