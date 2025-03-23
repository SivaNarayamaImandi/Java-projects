package array_programs;

public class AAAAAA {
	public static void main(String[] args) {
		int[] a = { 10, 30, 10, 40, 90, 60, 30 };
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					count++;
			}
			boolean isPresent = true;
			for (int j = i - 1; j >= 0; j--) {
				if (a[i] == a[j])
					isPresent = false;
			}
			if (isPresent && count == 0)
				System.out.print(a[i] + ",");
		}
		System.out.println();
		squareOfSelfElements();
		System.out.println();
		startsWithSpecificNumber();
		System.out.println();
		larAndSma();
		System.out.println();
		decendingOrder();
		System.out.println();
		mostRepeatedElement();
		System.err.println();
		nthLar();
		System.out.println();
		sortOnlyOdd();
		System.out.println();
		margeTwoArrays();
	}

	private static void squareOfSelfElements() {
		int[] a = { 10, 30, 10, 40, 90, 60, 30 };
		int[] sq = new int[a.length];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			sq[index] = a[i] * a[i];
			index++;
		}
		for (int i : sq) {
			System.out.print(i + " ");
		}
	}

	private static void startsWithSpecificNumber() {
		int[] a = { 10, 30, 10, 40, 90, 60, 30 };
		int n = 9;
		for (int i = 0; i < a.length; i++) {
			int num = a[i];
			int st = num % 10;
			while (num != 0) {
				st = num % 10;
				num /= 10;
			}
			if (st == n)
				System.out.println(a[i] + " ");
		}
	}

	private static void larAndSma() {
		int[] a = { 10, 30, 10, 40, 90, 60, 30 };
		int lar = a[0];
		int sma = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > lar)
				lar = a[i];
			if (a[i] < sma)
				sma = a[i];
		}
		System.out.println(lar + " " + sma);
	}

	private static void decendingOrder() {
		int[] a = { 10, 30, 10, 40, 90, 60, 30 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	private static void mostRepeatedElement() {
		int[] a = { 10, 30, 10, 40, 90, 60, 30 };
		int[] freq = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			freq[i]++;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j] && a[i] != -1) {
					freq[i]++;
					a[j] = -1;
				}
			}
		}
		int most = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > most)
				most = freq[i];
		}
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == most)
				System.out.println(a[i] + " " + most);
		}
	}

	private static void nthLar() {
		int[] a = { 10, 30, 10, 40, 90, 61, 30 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				System.out.println(a[i]);
				break;
			}
		}
	}

	private static void sortOnlyOdd() {
		int[] a = { 10, 31, 10, 41, 90, 61, 30 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				for (int j = 0; j < a.length; j++) {
					if (a[j] % 2 == 1 && a[i] > a[j]) {
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

	private static void margeTwoArrays() {
		int[] a = { 10, 31, 10, 41, 90, 61, 30 };
		int[] a1 = { 38, 83, 81, 458 };
		int[] a2 = new int[a.length + a1.length];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			a2[i] = a[i];
			index++;
		}
		for (int i = 0; i < a1.length; i++) {
			a2[index] = a1[i];
			index++;
		}
		for (int i : a2) {
			System.out.print(i + " ");
		}
	}
}
