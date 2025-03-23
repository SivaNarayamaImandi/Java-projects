package string_programs;

public class RevFirstAndLastLetString {
	public static void main(String[] args) {
		// WAPT Reverse First and last letter of string
		String string = "JAVA";
		char first=string.charAt(0);
		char last=string.charAt(string.length()-1);
		String mid=string.substring(1,string.length()-1);
		System.out.println(last+mid+first);
		
	}
}
