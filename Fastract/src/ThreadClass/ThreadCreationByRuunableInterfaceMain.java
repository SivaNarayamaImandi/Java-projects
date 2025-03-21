package ThreadClass;

public class ThreadCreationByRuunableInterfaceMain {
	public static void main(String[] args) {
		ThreadCreationByRuunableInterface tr=new ThreadCreationByRuunableInterface();
		Thread t=new Thread(tr);
		t.start();
		
	}
}
