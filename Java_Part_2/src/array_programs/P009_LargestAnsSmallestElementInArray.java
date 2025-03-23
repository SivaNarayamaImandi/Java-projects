package array_programs;

public class P009_LargestAnsSmallestElementInArray {
	public static void main(String[] args) {
		int[] a = ArrayUtil.getIntArray();
		ArrayUtil.printIntArray(a);
		System.out.println();
		int larger = 0;
		int smaller = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > larger && (a[i] % 2) == 0)
				larger = a[i];
			if (a[i] < smaller)
				smaller = a[i];
		}
		System.out.println(larger);
		System.out.println(smaller);
	}
}
