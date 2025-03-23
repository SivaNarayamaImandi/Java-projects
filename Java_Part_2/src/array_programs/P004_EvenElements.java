package array_programs;

public class P004_EvenElements {
	public static void main(String[] args) {
		int[] a = ArrayUtil.getIntArray();
		ArrayUtil.printIntArray(a);
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + " ");
			}
//			if (a[i] % 2 == 1) {
//				System.out.println(a[i] + " ");
//			}
		}
	}
}
