package string_programs;

public class SumOfDigisInString {
	public static void main(String[] args) {
		String string = "Cloud987 Blue5";
		int sum = 0;
		for (int i = 0; i < string.length(); i++) {
			char c = string.charAt(i);
			if (Character.isDigit(c)) {
				int j = Integer.parseInt(c + "");
				sum += j;//sum=sum+j
			}
		}
		System.out.println(sum);
		
	}
}
