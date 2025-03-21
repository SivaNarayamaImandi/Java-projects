package types_of_methods;

public class MethodWithoutArgWithReturnType {

	public static int addition() {
		int i = 10;
		int j = 10;
		//int k = i - j;
		System.out.println(i-j);
		return i-j;//10-10-->0
	}

	public static void main(String[] args) {
		System.out.println(addition());
	}
}
