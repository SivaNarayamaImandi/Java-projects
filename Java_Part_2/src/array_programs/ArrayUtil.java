package array_programs;

import java.util.Random;

public class ArrayUtil {
	public static int[] getIntArray() {
		Random random = new Random();
		int r = random.nextInt(2, 20);
		int[] arr = new int[r];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(1, 100);
		}
		return arr;
	}

	public static void printIntArray(int[] a) {
		System.out.print("[");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.print("]");
	}

	public static double[] getDoubleArray() {
		Random random = new Random();
		int r = random.nextInt(2, 20);
		double[] drr = new double[r];

		for (int i = 0; i < drr.length; i++) {
			drr[i] = random.nextDouble(7.55, 75.8);
		}
		return drr;
	}

	public static void printDoubleArray(double[] d) {
		System.out.print("[");
		for (double i : d) {
			System.out.print(i + " ");
		}
		System.out.print("]");
	}
}
