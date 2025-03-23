package string_programs;

public class OnlyDigitsInString {
	public static void main(String[] args) {
		// WAPTP only digits present in agiven string
		String s = "Cloud987Blue";
		for (int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);
			if (charAt >= 48 && charAt <= 57) {
				System.out.print(charAt + " ");
			}
//		
//		if(Character.isDigit(s.charAt(i)))
//		{
//			System.out.print(s.charAt(i)+" ");
//		}
		}
	}
}
