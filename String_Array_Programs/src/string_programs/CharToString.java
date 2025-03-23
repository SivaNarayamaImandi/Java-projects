package string_programs;

public class CharToString {
	public static void main(String[] args) {
		// WAPT convert character array to string
		char[] cs = { 'S', 'I', 'V', 'A' };
		String strings = "";
		System.out.print("THIS IS STRING : ");
		for (int i = 0; i < cs.length; i++) {
			strings += cs[i];
		}
		System.out.println(strings);

		System.out.print("\nTHIS IS CHARARRAY : ");
		for (char c : cs) {
			System.out.print(c);
		}

	}

}
