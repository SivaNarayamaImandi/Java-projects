package array_programs;

public class Rapping {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[] a = { 3, 1, 2, 4, 0, 1, 3, 2 };
		int[] a1 = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			a1[i] = a[i];
			for (int j = 0; j < i; j++) {
				if (a1[i] < a[j]) {
					a1[i] = a[j];

				}
			}
		}
		for (int i : a1) {
			System.out.print(i + " ");
		}
		System.out.println();

		int[] a2 = new int[a.length];
		for (int i = a.length - 1; i >= 0; i--) {
			a2[i] = a[a.length - 1];
			for (int j = 0; j < i; j++) {
				if (a2[i] <= a[j]) {
					a2[i] = a[j];
				}
			}
		}
		for (int i = a2.length - 1; i >= 0; i--) {
			System.out.print(a2[i] + " ");
		}
		System.out.println();
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			int x = a[i];
			for (int j = 0; j < a1.length; j++) {
				int y = a1[j];
				for (int j2 = 0; j2 < a2.length; j2++) {
					int z = a2[j2];
					if (y > z) {
						sum = sum + (y - x);
						break;
					} else {
						sum = sum + (z - x);
						break;
					}
				}
				break;
			}
		}
		System.out.println(sum);
	}
}
