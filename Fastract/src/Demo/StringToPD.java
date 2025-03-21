package Demo;

public class StringToPD {
	public static void main(String[] args) {
		String s="46567";
		int i=Integer.parseInt(s);
//		System.out.println(i);
		char[] charArray = s.toCharArray();
		for (int j = 0; j < charArray.length; j++) {
			System.out.println(charArray[j]);
		}
		
		char c = s.charAt(3);
//		System.out.println(c);
		
		
		Integer of = Integer.valueOf(s);
//		System.out.println(of);
	}
}
