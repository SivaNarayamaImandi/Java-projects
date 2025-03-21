package ArrayListConcept;

public class AlEmployee {
	private String name;
	private int id;
	private double sal;
	private String loc;
	
	
	
	public AlEmployee() {
		
	}

	public AlEmployee(String name, int id, double sal, String loc) {
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.loc = loc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	
	@Override
	public String toString() {
		return " name=" + name + " id=" + id + " sal=" + sal + " loc=" + loc+"\n";
	}

	public void display() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(sal);
		System.out.println(loc);
	}
	
}
