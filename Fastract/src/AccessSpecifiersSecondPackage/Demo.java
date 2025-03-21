package AccessSpecifiersSecondPackage;

import AccessSpecifiers.Protected;

public class Demo extends Protected{
	public static void main(String[] args) {
		System.out.println(Protected.a);
		Protected.test();
	}
}
