package string_programs;

public class StringArrayTocharArratWithOutUsingtoCharArray {
//WAPT Convert String to character array without using toCharArray[]
	public static void main(String[] args) {
		String string = "JAVA";
		char[] charArr = new char[string.length()];
		for (int i = 0; i < string.length(); i++) {
			charArr[i] = string.charAt(i);
		}
		System.out.println(string);
		for (char c : charArr) {
			System.out.println(c);
		}
	}
}
