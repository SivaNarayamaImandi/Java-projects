package Demo;

public class Demo1 {
	public void sum()
	{
		int i=10;
		int j=10;
		System.out.println(i+j);
	}
	public void car()
	{
		System.out.println("Car");
	}
	public static void a()
	{
		System.out.println("hello");
	}
	public static void main(String[] args) {
		System.out.println("Main Starts");
		a();
		//ClassName orv = new ClassName();
		Demo1 d=new Demo1();
		d.car();
		d.sum();
		System.out.println("Main Ends");
	}
}
