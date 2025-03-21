package Demo;

public class MultiThreading1 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++)
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
