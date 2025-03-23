package array_programs;

import java.util.Scanner;

public class P008_StartsWithNnumber {
	public static void main(String[] args) {
		int[] a = ArrayUtil.getIntArray();
		ArrayUtil.printIntArray(a);
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			int x = a[i];
			int ld = 0;
			while (x != 0) {
				ld = x % 10;
				x /= 10;
			}
			if (ld == n)
				System.out.println(a[i]);
		}
		sc.close();
	}
}
