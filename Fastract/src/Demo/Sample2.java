package Demo;

public class Sample2 {
	public static void abc()
	{
		System.out.println("Abc");
	}
	public void xyz()
	{
		System.out.println("xyz");
	}
	public static void main(String[] args) {
		System.out.println("Main starts");
		abc();
		Sample2 s2= new Sample2();
		s2.xyz();
		System.out.println("Main Ends");
	}
}
