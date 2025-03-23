package string_programs;

public class RevString {
	public static void main(String[] args) {
		String string = "jAVA";
		String rev = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			char charAt = string.charAt(i);
			rev += charAt;
		}
		System.out.println(rev);
	}
}
