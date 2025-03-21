package ThreadClass;

public class Test extends Thread{
	@Override
	public void run() {
		for(int i=6;i<=10;i++)
		{
			try {
				Thread.sleep(500);
				System.out.println(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
