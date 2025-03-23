package basic_programs;

public class CharToString {
	public static void main(String[] args) {
		// WAPT convert character array to string
		char[] cs = { 'S', 'I', 'V', 'A' };
		String strings = "";
		System.out.print("THIS IS STRING : ");
		for (int i = 0; i < cs.length; i++) {
			strings = strings + cs[i];
		}
		System.out.println(strings);
		System.out.println("--------------------------");
		System.out.print("THIS IS CHAR ARRAY : ");
		for (char c : cs) {
			System.out.print(c);
		}

		// or
		System.out.println();
		System.out.println("--------------------------");
		String string = new String(cs);
		System.out.println("ANOTHER WAY OF CONVERTING : " + string);

	}

}
