package FileHandling;

import java.io.Serializable;

public class InputStreamClass implements Serializable{
	private String name;
	private int id;
	private int sal;
	private String loc;

	public InputStreamClass(String name, int id, int sal, String loc) {
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

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	public void display() {
		System.out.println(getName());
		System.out.println(getId());
		System.out.println(getSal());
		System.out.println(getLoc());
	}
}
