package Demo;

public class Marker {
	
	public static void marker()
	{
		int height=15;
		String brand="raynolds";
		System.out.println(height);
		System.out.println(brand);
	}
	public void red()
	{
		marker();
		String color="black";
		System.out.println(color);
	}
	public void blue()
	{
		marker();
		String color="red";
		System.out.println(color);
	}
	public static void main(String[] args) {
		//marker();
		Marker m=new Marker();
		m.red();
		System.out.println();
		m.blue();
	}
}
