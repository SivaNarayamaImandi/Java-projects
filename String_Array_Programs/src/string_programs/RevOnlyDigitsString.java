package string_programs;

public class RevOnlyDigitsString {
	public static void main(String[] args) {
		// WAPT read a string and reverse only the digits by retaining all other characters position
		// ex: cloud987blue
		// output: cloud789blue
//		String string = "cloud987blue";
//		String substring = "";
//		String[] s = string.split(substring);
//		String first = s[0];
//		String last = s[1];
//		for (int i = 0; i < string.length(); i++) {
//			char charAt = string.charAt(i);
//			if (Character.isDigit(charAt)) {
//				substring = charAt + substring;
//			}
//		}
//		System.out.println(first + substring + last);
		
		String string = "cloud987blue121";
		String s="";
		String s1="";
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			
			if(Character.isAlphabetic(c))
			{
				s1=s1+c;
			}
			else if(Character.isDigit(c))
			{
				while(Character.isDigit(string.charAt(i)))
				{
					
					s = s+string.charAt(i);
					i++;
					
				}
			}
			
			String res = "";
			for(int j=s.length()-1;j>=0;j--)
			{
				res = res + s.charAt(j);
			}
			
			s1 = s1+res;
			s="";
		}
		System.out.println(s1);
	}
}