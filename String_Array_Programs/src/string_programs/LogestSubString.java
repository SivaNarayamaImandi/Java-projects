package string_programs;

public class LogestSubString {
	public static void main(String[] args) {
		// WAP read a sentance and print logest substring
		// ex: good morning did you have breakfast
		// output: breakfast
		String s = "good morning did you have breakfast";
		String[] split = s.split(" ");
		String length = split[0];
		for (int i = 0; i < split.length; i++) {
			if (length.length() <= split[i].length()) {
				length = split[i];
			}
		}
		System.out.println(length);
	}
}
