package string_programs;

public class AnagramString {
	public static void main(String[] args) {
		String s1 = "top";
		String s2 = "pot";
		boolean b = s1.length() == s2.length();
		if (b) {
			boolean isPresent = true;
			for (int i = 0; i < s1.length(); i++) {
				char c = s1.charAt(i);
				for (int j = 0; j < s2.length(); j++) {
					char d = s2.charAt(j);
					if (d == c) {
						isPresent = true;
					} else {
						isPresent = false;
					}
				}
			}
			if (isPresent == true) {
				System.out.println("Anagram");
			} else {
				System.out.println("Not A angram");
			}
		} else {
			System.out.println("String lenght is not same.\nHence it is not a anagram");
		}
	}
}
