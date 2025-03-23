package array_programs;

public class PrintUniqElement {
	public static void main(String[] args) {
		//WAPTP uniqe elements in an array
		//WAPTP Duplicate elements in an array
		int[] arr = { 10, 20, 40, 50, 10, 40, 20 };
		int[] freq = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			freq[i]++;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j] && arr[j] != -1) {
					freq[i]++;
					arr[j] = -1;
				}
			}
		}
		int count=0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != 1 && arr[i] != -1)
				count++;
		}
		int[] result = new int[count];
		int index = 0;
		for (int i = 0; i < freq.length; i++) {
			if(freq[i] != 1 && arr[i] != -1)
			{
				result[index++] = arr[i];
			}
		}
		for (int i : result) {
			System.out.print(i+" ");
		}
	}
}