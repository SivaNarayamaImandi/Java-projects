package array_programs;

public class P020_SortOnlyNagetiveElements {
	public static void main(String[] args) {
		int[] a = { 80, 20, -80, 60, 10, -45, 90, -20 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				for (int j = 0; j < a.length; j++) {
					if (a[i] < 0 && a[i] > a[j]) {
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
