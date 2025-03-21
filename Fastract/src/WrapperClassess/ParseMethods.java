package WrapperClassess;

public class ParseMethods {
	public static void main(String[] args) {
		String s = "45";
		System.out.println(s);
		int i = Integer.parseInt(s);
		System.out.println(i);

		String s1 = "87934.5";
		float f = Float.parseFloat(s1);
		System.out.println(f);
		
		boolean b = Boolean.parseBoolean("true");
		System.out.println(b);
		System.out.println(s1.charAt(0));
	}
}
