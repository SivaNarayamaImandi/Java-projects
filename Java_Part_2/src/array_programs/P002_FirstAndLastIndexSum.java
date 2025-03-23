package array_programs;

public class P002_FirstAndLastIndexSum {
	public static void main(String[] args) {
		int[] array = ArrayUtil.getIntArray();
		ArrayUtil.printIntArray(array);
		int sum = 0;
		sum = array[0] + array[array.length - 1];
		System.out.println();
		System.out.println(sum);
	}
}
