package string_programs;

public class CountOfWordsPresentInString {
	public static void main(String[] args) {
		//WAPT Displapy number of words present in a string
		String s = "JAVA SQL HTML CSS";
		String[] split = s.split(" ");
		int count = 0;
		for (String string : split) {
			count++;
			System.out.println(string);
		}
		System.out.println("\nTOTAL COUNT OF WORDS PRESENT IN STRING IS : " + count);
	}
}
