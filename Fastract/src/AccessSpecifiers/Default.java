package AccessSpecifiers;

class Default {
	static int a=10;
	
	static void test()
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		test();
	}
}
