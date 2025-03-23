package string_programs;

public class PalidromString {
	public static boolean palidrom(String string) {
		String rev = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			char c = string.charAt(i);
			rev = rev + c;
		}
		if (string.equals(rev))
			return true;
		return false;
	}
}
