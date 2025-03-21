package Demo;

public class SingleTon {
	public int id;
	public static SingleTon s=null;
	public SingleTon(int id) {
		super();
		this.id = id;
		display();
	}
	public void display()
	{
		System.out.println(id);
	}
	public static void createSingleTon()
	{
		if(s==null)
			s=new SingleTon(123);
		else
			System.out.println("Single Ton Is Created...");
	}
}
