package types_of_methods;

public class MethodWithoutargAndWithoutReturnType {

	public static void addition() {
		System.out.println("Addition");
		int i = 10;
		int j = 10;
		int k = i + j;
		System.out.println(k);
	}

	public static void test() {
		System.out.println("hello");
	}

	public static void test1() {
		System.out.println("hello");
	}

	public static void test2() {
		System.out.println("hello");
	}
	
	public static void character(char c)
	{
		System.out.println((int)c);
		int i=10;
		System.out.println(i);
	}

	public static void main(String[] args) {
		System.out.println("Main Starts");
		// addition();
//		test();
//		test1();
//		test2();
		character('A');
		System.out.println("Main Ends");
	}
}
