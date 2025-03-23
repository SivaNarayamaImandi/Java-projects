package array_programs;

public class P004_PrimeNumbers {
	public static void main(String[] args) {
		int[] a = ArrayUtil.getIntArray();
		ArrayUtil.printIntArray(a);
		System.out.println();
		for (int j = 0; j < a.length; j++) {
			int count = 0;
			int k = a[j];
			for (int i = 1; i <= k; i++) {
				if (k % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.print(a[j] + " ");
			}
		}
	}
}
