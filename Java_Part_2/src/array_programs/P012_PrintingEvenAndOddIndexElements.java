package array_programs;

public class P012_PrintingEvenAndOddIndexElements {
	public static void main(String[] args) {
		int[] a = ArrayUtil.getIntArray();
		ArrayUtil.printIntArray(a);
		System.out.println();
		for (int i = 0; i < a.length; i++) {
//			if (i % 2 == 1)
//				System.out.print(a[i] + " ");
			if (i % 2 == 0)
				System.out.print(a[i] + " ");
		}
	}
}
