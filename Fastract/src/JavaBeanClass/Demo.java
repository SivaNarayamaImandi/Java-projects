package JavaBeanClass;

public class Demo {
	private int a;
	private int b;
	private int c;
	
	public Demo() {
		
	}
	
	public Demo(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
}
