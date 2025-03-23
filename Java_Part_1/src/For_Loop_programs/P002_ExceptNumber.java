package For_Loop_programs;

import java.util.Scanner;

public class P002_ExceptNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter start number : ");
		int start = sc.nextInt();
		System.out.print("Enter end number : ");
		int end = sc.nextInt();
		System.out.print("Enter except number : ");
		int except = sc.nextInt();
		for (int i = start; i <= end; i++)
			if (i != except)
				System.out.println(i);
		sc.close();
	}
}
