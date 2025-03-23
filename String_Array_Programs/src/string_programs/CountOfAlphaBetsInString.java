package string_programs;

public class CountOfAlphaBetsInString {

	public static void main(String[] args) {
		String string="hfCDJks456bhghj@#$%^fbgFJsn";
		int count=0;
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if((c>='A' && c<='Z') || (c>='a' && c<='z'))
			{
				count++;
			}
//			if(Character.isAlphabetic(c))
//			{
//				count++;
//			}
		}
		System.out.println(count);
	}
}
