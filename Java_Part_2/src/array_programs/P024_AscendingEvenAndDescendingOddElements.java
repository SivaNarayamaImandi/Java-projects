package array_programs;

public class P024_AscendingEvenAndDescendingOddElements {
	public static void main(String[] args) {
		int[] a = ArrayUtil.getIntArray();
		ArrayUtil.printIntArray(a);
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				for (int j = 0; j < a.length; j++) {
					if (a[j] % 2 == 0 && a[i] < a[j]) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
			} else {
				if (a[i] % 2 != 0) {
					for (int j = 0; j < a.length; j++) {
						if (a[j] % 2 != 0 && a[i] > a[j]) {
							int temp = a[i];
							a[i] = a[j];
							a[j] = temp;
						}
					}
				}
			}
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}
}
