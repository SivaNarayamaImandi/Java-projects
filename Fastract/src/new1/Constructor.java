package new1;

public class Constructor {
	private int id;
	private String name;
	
	public Constructor() {}
	
	public Constructor(int id, String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public void display()
	{
		System.out.println(id);
		System.out.println(name);
	}
	
}
