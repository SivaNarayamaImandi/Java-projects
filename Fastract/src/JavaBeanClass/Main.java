package JavaBeanClass;

public class Main {
	public static void main(String[] args) {
		Demo d=new Demo();
		Demo d1=new Demo(10,30,40);
		Demo d2=new Demo();
		d1.display();
		d.setA(20);
		d.display();
		d2.setC(60);
		d2.display();
	}
}
