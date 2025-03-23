package string_programs;

public class SplitString {
	public static void main(String[] args) {
		String s = "How are you";
		String[] split = s.split(" ");
		System.out.println(s);
		System.out.println(split.length);
		int count=0;
		//System.out.println(split[0]);
		for (String string : split) {
			System.out.println(string);
		}
		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			if(split.length>=2 && Character.isDigit(c))
			{
				count++;
			}
		}
		
		System.out.println(count);
//		String[] split = string.split(" ");
//		if(split.length>=2)
//		{
//			System.out.println(true);
//		}
//		else
//		{
//			System.out.println(false);
//		}
	}
}
