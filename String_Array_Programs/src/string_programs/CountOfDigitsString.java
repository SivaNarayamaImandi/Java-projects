package string_programs;

public class CountOfDigitsString {
	public static void main(String[] args) {
		String string = "bnbsjsA578BDs88svB";
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (Character.isDigit(c)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
