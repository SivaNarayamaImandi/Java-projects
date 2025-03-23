package array_programs;

import java.util.Scanner;

public class P010_NthLargestElementArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int[] a = { 10, 30, 10, 40, 90, 60, 30 };
		int[] a = ArrayUtil.getIntArray();
		ArrayUtil.printIntArray(a);
		System.out.println();
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				count++;
			}
		}
		int[] result = new int[count];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				result[index++] = a[i];
			}
		}

//		for deccending order
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				if (result[i] > result[j]) {
					int temp = result[i];
					result[i] = result[j];
					result[j] = temp;
				}
			}
		}

		boolean isCurrect = true;
		while (isCurrect) {
			System.out.println("Enter \n 1. For find nth largest\n 2. For find nth smallest");
			int num = sc.nextInt();
			if (num == 1) {
				for (int i : result) {
					System.out.print(i + " ");
				}

				System.out.println();
				System.out.print("Enter a number : ");
				int n = sc.nextInt();
				for (int i = 0; i < result.length; i++) {
					while (true) {
						if (i == n - 1) {
							System.out.println(result[i]);
							isCurrect = false;
							break;
						} else if (n == 0 || result.length < n) {
							System.out.println("Enter valid input\nfrom 1 to " + result.length);
							n = sc.nextInt();
							continue;
						}
						break;
					}
				}
			}

			// for assending order
			for (int i = 0; i < result.length; i++) {
				for (int j = 0; j < result.length; j++) {
					if (result[i] < result[j]) {
						int temp = result[i];
						result[i] = result[j];
						result[j] = temp;
					}
				}
			}

			if (num == 2) {
				for (int i : result) {
					System.out.print(i + " ");
				}

				System.out.println();
				System.out.print("Enter a number : ");
				int n = sc.nextInt();
				for (int i = 0; i < result.length; i++) {
					while (true) {
						if (i == n - 1) {
							System.out.println(result[i]);
							isCurrect = false;
							break;
						} else if (n == 0 || result.length < n) {
							System.out.println("Enter valid input\nfrom 1 to " + result.length);
							n = sc.nextInt();
							continue;
						}
						break;
					}
				}
			}
			if (num != 1 && num != 2) {
				System.out.println("Please enter valid number\n");

			}
		}
		sc.close();
	}
}
