package Demo;


public class MultiThreading2 extends Thread{
	@Override
	public void run() {
		for(int i=6;i<=10;i++)
		{
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.out.println("handled....");
			}
			System.out.println(i);
		}
	}
}
