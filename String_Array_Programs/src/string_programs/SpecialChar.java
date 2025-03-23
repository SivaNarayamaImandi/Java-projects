package string_programs;

public class SpecialChar {
	public static void main(String[] args) {
		// WAPTP only special character " Cloud@987#blue"
		String string = "Cloud@987#blue";
		for (int i = 0; i < string.length(); i++) {
			char charAt = string.charAt(i);
//			if (!((charAt >= 48 && charAt <= 57) || (charAt >= 'A' && charAt <= 'Z')
//					|| (charAt >= 'a' && charAt <= 'z'))) 
//			{
//				System.out.println(charAt);
//			}
			if (!Character.isAlphabetic(charAt) && !Character.isDigit(charAt)) {
				System.out.println(charAt);
			}
		}
//	System.out.println();
	}
}
