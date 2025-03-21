package ThreadClass;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread t=new Thread();
//		System.out.println(t.getId());
//		System.out.println(t.getName());
//		System.out.println(t.getPriority());
//		System.out.println("-------------");
		t.setName("Siva");
		t.setPriority(1);
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		System.out.println("-------------");
		
		Thread t1=new Thread();
		
//		System.out.println(t1.getId());
//		System.out.println(t1.getName());
//		System.out.println(t1.getPriority());
//		System.out.println("-------------");
		t1.setName("Hello");
		t1.setPriority(3);
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
	}
}
