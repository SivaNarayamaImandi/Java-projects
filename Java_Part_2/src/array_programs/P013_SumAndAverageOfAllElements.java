package array_programs;

public class P013_SumAndAverageOfAllElements {
	public static void main(String[] args) {
		int[] a = ArrayUtil.getIntArray();
		ArrayUtil.printIntArray(a);
		System.out.println();
		double sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("\nSum	: " + sum);
		System.out.println("Average	: " + sum / a.length);
	}
}
