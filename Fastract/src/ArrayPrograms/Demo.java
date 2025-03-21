package ArrayPrograms;

public class Demo {
	public static void main(String[] args) {
		int[] arr = new int[4];
		arr[0] = 10;
		arr[1] = 11;
		arr[2] = 21;
		arr[3] = 30;

		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 1; j <= arr[i]; j++) {
				if (arr[i] % j == 0)
					count++;
			}
			if (count == 2)
				System.out.println(arr[i]);
		}

	}
}
