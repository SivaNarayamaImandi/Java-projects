package StringClass;

public class StringIntro {
	public static void main(String[] args) {
//		int i = 10;
//		System.out.println(i + " Primitive");
//		Integer j = i;
//		System.out.println(j + " Object");
//		
//		byte b=10;
//		System.out.println(b);
//		Byte b1=b; // implicite
//		System.out.println(b1);

		Integer d1 = new Integer(80); // explicite
		System.out.println(d1);

		int v = d1;
		System.out.println(v); // implicite

		int b = d1.intValue(); // Explicite
		System.out.println(b);
	}
}
