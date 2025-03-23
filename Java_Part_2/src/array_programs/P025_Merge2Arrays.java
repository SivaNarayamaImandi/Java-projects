package array_programs;

public class P025_Merge2Arrays {
	public static void main(String[] args) {
		int[] a = ArrayUtil.getIntArray();
		ArrayUtil.printIntArray(a);
		System.out.println();
		System.out.println(a.length);
		int[] a1 = ArrayUtil.getIntArray();
		ArrayUtil.printIntArray(a1);
		System.out.println();
		System.out.println(a1.length);
		int index = 0;
		int[] a2 = new int[a.length + a1.length];
		for (int i = 0; i < a.length; i++) {
			index++;
			a2[i] = a[i];
		}
		for (int i = 0; i < a1.length; i++) {
			a2[index] = a1[i];
			index++;
		}
		System.out.println(index);
		for (int i : a2) {
			System.out.print(i + " ");
		}
	}
}
