package array_programs;

public class P001_ArrayLength {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int[] array = ArrayUtil.getIntArray();
		ArrayUtil.printIntArray(array);
		System.out.println();
		// without using length method
		int count = 0;
		for (int i : array) {
			count++;
		}
		System.out.println(count);
		// with using length method
		System.out.println(array.length);
	}
}
