package array_programs;

public class CountArrayLength {
	// WAPT count each and every element in an array 
	//(frequency of element in anarray)
	//or
	public static void main(String[] args) {
		int[] i = { 10, 20, 5, 10, 30, 10, 20, 5 ,40};
		int[] freq = new int[i.length];
		for (int j = 0; j < i.length; j++) {
			freq[j]++;
			for (int j2 = j + 1; j2 < i.length; j2++) {
				if ((i[j] == i[j2]) && (i[j2] != -1)) {
					freq[j]++;
					i[j2] = -1;
				}
			}
		}
		for (int j = 0; j < freq.length; j++) {
			if(freq[j]!=1&&i[j]!=-1)
				System.out.println(i[j]+"--"+freq[j]);
		}
	}
}
//WAPT find 2nd largest or nth largest num in an array
//WAPT find 2nd smallest or nth smallest num in an array