package string_programs;

public class ExtractOnlyAlphabets {
	public static void main(String[] args) {
		// WAPTP only alphabets present in the given string
		// String is Cloud987Blue
		String s = "Cloud987Blue";
		for (int i = 0; i < s.length(); i++) {
//			if(Character.isAlphabetic(s.charAt(i)))
//			{
//				System.out.print(s.charAt(i)+" ");
//			}
			char charAt = s.charAt(i);
//			if ((charAt >= 'A' && charAt <= 'Z') || (charAt >= 'a' && charAt <= 'z')) {
//				System.out.print(charAt + " ");
//			}
			if(Character.isAlphabetic(charAt))
			{
				System.out.println(charAt);
			}
		}

		// System.out.println((int) 'A');
	}
}
