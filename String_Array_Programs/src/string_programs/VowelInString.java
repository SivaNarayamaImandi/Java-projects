package string_programs;

public class VowelInString {
	public static void main(String[] args) {
		String string = "DHKJeelkjOfs6oo2892aasEEhkjsdsgjIIIfds$%^&";
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if ((c == 'a') || (c == 'A') || (c == 'e') || (c == 'E') || (c == 'i') || (c == 'I') || (c == 'o')
					|| (c == 'O') || (c == 'u') || (c == 'U')) {
				count++;
			}
		}
		System.out.println(count);
	}
}
