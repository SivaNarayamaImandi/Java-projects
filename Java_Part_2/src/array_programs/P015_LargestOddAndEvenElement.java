package array_programs;

public class P015_LargestOddAndEvenElement {
	public static void main(String[] args) {
		int[] a = ArrayUtil.getIntArray();
		ArrayUtil.printIntArray(a);
		System.out.println();
//		int[] a = { 10, 30, 40, 50, 10, 20, 10, 30 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate)
				count++;
		}
		int[] result = new int[count];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate)
				result[index++] = a[i];
		}
		System.out.println();

//		for deccending order

		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result.length; j++) {
				if (result[i] > result[j]) {
					int temp = result[i];
					result[i] = result[j];
					result[j] = temp;
				}
			}
		}
		for (int i : result) {
			System.out.print(i + " ");
		}
		System.out.println();

//		for even element
		int lar = 0;
		for (int i = 0; i < result.length; i++) {
			if (result[i] > lar && (result[i] % 2) == 0) {
				lar = result[i];
			}
		}
		System.out.println("Largest even element :" + lar);

//		for odd element
		int lar1 = 0;
		for (int i = 0; i < result.length; i++) {
			if (result[i] > lar1 && (result[i] % 2) == 1) {
				lar1 = result[i];
			}
		}
		System.out.println("Largest odd element :" + lar1);
	}
}
