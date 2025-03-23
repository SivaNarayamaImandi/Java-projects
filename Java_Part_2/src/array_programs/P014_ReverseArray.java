package array_programs;

public class P014_ReverseArray {
	public static void main(String[] args) {
		int[] a = ArrayUtil.getIntArray();
		ArrayUtil.printIntArray(a);
		System.out.println();
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + " ");
		}
	}
}
