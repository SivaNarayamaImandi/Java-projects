package string_programs;

public class Demo {
	public static void main(String[] args) {
		String s = "hfkhsYD Hkhglds";
		String s1 = "red";
		String s2 = "Red";

		int i = s.length();
		System.out.println(i);

		String upperCase = s.toUpperCase();
		System.out.println(upperCase);

		String lowerCase = s.toLowerCase();
		System.out.println(lowerCase);

		char[] cs = s.toCharArray();
		for (char c : cs) {
			System.out.println(c);
		}

		String string = s.substring(5);
		System.out.println(string);

		String string2 = s.substring(0, 5);
		System.out.println(string2);

		String[] a = s.split(" ");
		for (String b : a) {
			System.out.println(b);
		}

		boolean b = s.equals(s1);
		System.out.println(b);

		boolean c = s1.equalsIgnoreCase(s2);
		System.out.println(c);

		char at = s.charAt(10);
		System.out.println(at);

	}
}
