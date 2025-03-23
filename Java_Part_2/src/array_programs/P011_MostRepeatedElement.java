package array_programs;

public class P011_MostRepeatedElement {
	public static void main(String[] args) {
		int[] a = { 10, 20, 10, 20, 40, 39, 78, 10, 20, 10, 20, 10 };
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
		int mostRepeated = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] > mostRepeated)
				mostRepeated = freq[i];
		}
		for (int i : freq) {
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] == mostRepeated)
				System.out.println(a[i] + "-->" + mostRepeated);
		}
	}
}
