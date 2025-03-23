package string_programs;

public class RevStringEachWord {
	public static void main(String[] args) {
		String s = "Java Is A Programming Language";
		String[] s1 = s.split(" ");
		String s3 = "";
		for (int i = 0; i < s1.length; i++) {
			for (int j = s1[i].length() - 1; j >= 0; j--) {
				char c = s1[i].charAt(j);
				s3 += c;
			}
			s3 += " ";
		}
		System.out.println(s3);
	}
}
