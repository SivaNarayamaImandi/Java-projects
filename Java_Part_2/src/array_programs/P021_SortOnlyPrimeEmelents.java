package array_programs;

public class P021_SortOnlyPrimeEmelents {
	public static void main(String[] args) {
		int[] a = ArrayUtil.getIntArray();
		ArrayUtil.printIntArray(a);
//		int[] a = { 13, 8, 10, 3, 6, 31, 2, 40, 22, 5 };
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			if (prime(a[i])) {
				for (int j = 0; j < a.length; j++) {
					if (prime(a[j]) && a[i] < a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			}
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	public static boolean prime(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				count++;
		}
		if (count == 2)
			return true;
		else
			return false;
	}
}
