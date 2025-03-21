package Demo;

public class A {
	public int empId;
	public static A a=null;
	public A(int empId)
	{
		this.empId=empId;
		display();
	} 
	public void display()
	{
		System.out.println(empId);
	}
	public static void createA()
	{
		if(a==null)
			a=new A(7987);
		else
			System.out.println("A is Created...");
	}
}
