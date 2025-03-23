package array_programs;

public class New {
	public static void main(String[] args) {
		int[] a = ArrayUtil.getIntArray();
		ArrayUtil.printIntArray(a);
		System.out.println();
		for (int i = 0; i < a.length; i++) {

			if (i % 2 == 0) {
				int z = a[i];
				int count = 0;
				for (int j = 1; j <= z; j++) {
					if (z % j == 0)
						count++;
				}
				if (count != 2) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
