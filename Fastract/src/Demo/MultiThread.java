package Demo;

public class MultiThread {
	public static void main(String[] args) {
		MultiThreading1 m1=new MultiThreading1();
		m1.start();
		MultiThreading2 m2=new MultiThreading2();
		m2.start();
	}
}
