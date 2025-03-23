package array_programs;

public class P022_SortOnlyPalindromElements {
	public static boolean palindrom(int n) {
		int temp = n;
		int rev = 0;
		while (temp != 0) {
			rev = rev * 10 + temp % 10;
			temp /= 10;
		}
		if (rev == n)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
//		int[] a = ArrayUtil.getIntArray();
//		ArrayUtil.printIntArray(a);
		int[] a = { 131, 8, 101, 32, 6, 311, 2, 121, 22, 5 };
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			if (palindrom(a[i])) {
				for (int j = 0; j < a.length; j++) {
					if (palindrom(a[j]) && a[i] < a[j]) {
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
}
