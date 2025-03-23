package array_programs;

public class P007_SquareOfItsSelfElement {
	public static void main(String[] args) {
		int[] a = ArrayUtil.getIntArray();
		ArrayUtil.printIntArray(a);
		System.out.println();
		int index = 0;
		int[] squreArray = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			squreArray[index] = a[i] * a[i];
			index++;
		}
		for (int i : squreArray) {
			System.out.print(i + " ");
		}
	}
}
