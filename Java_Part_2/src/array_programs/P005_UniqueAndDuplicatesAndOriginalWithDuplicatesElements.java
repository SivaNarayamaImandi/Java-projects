package array_programs;

public class P005_UniqueAndDuplicatesAndOriginalWithDuplicatesElements {
	public static void main(String[] args) {
		int[] a = { 10, 30, 10, 40, 90, 60, 30 };
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j])
					count++;
			}
			boolean isPresent = true;
			for (int j = i - 1; j >= 0; j--) {
				if (a[i] == a[j])
					isPresent = false;
			}
//			for 1 duplicate and uniques

//			if (isPresent && count >= 0)
//				System.out.print(a[i] + " ");

//			for only duplicate

//			if (!isPresent && count == 0)
//				System.out.print(a[i] + " ");

//			for only uniques

			if (isPresent && count == 0)
				System.out.print(a[i] + " ");
		}
	}
}
