package Demo;

public class ArrayListUsage {
	private int id;
	private String name;
	private double sal;
	private String location;
	
	public ArrayListUsage() {
	}

	public ArrayListUsage(int id, String name, double sal, String location) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.location = location;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "ArrayList [id=" + id + ", name=" + name + ", sal=" + sal + ", location=" + location + "]";
	}
	
}
