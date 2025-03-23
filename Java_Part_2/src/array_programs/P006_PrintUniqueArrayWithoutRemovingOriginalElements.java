package array_programs;

public class P006_PrintUniqueArrayWithoutRemovingOriginalElements {
	public static void main(String[] args) {
		int[] a = { 1, 2, 2, 3, 4, 4, 5 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					isDuplicate = true;
					break;
				}
			}
//			give isDuplicate for only duplicate array
			if (!isDuplicate)
				count++;
		}
		int index = 0;
		int[] result = new int[count];
		for (int i = 0; i < a.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					isDuplicate = true;
					break;
				}
			}
//			give isDuplicate for only duplicate array
			if (!isDuplicate)
				result[index++] = a[i];
		}
		int[] finalarray = result;
		for (int i : finalarray) {
			System.out.print(i + " ");
		}
	}
}
