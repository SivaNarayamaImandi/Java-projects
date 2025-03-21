package Demo;

public class Encapsulation {
	private int id;
	private String name;

	public void details(int id, String name) {
//		if(name.length()==4)
//			this.name=name;
//		else
//			System.out.println("Invalid data...");
//		
//		if(id==123)
//			this.id=id;
//		else
//			System.out.println("Invalid id...");
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println(id);
		System.out.println(name);
	}
}
