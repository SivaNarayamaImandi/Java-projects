package array_programs;

import java.util.Scanner;

public class P003_GivenNumberMultiplesOfArray {
	public static void main(String[] args) {
		int[] array = ArrayUtil.getIntArray();
		ArrayUtil.printIntArray(array);
		System.out.println();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		for (int i = 0; i < array.length; i++) {
			int j = array[i];
			if (j % n == 0) {
				System.out.print(array[i] + " ");
			}
		}
		sc.close();
	}
}
