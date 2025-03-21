package AccessSpecifiers;

public class Private {
	private static int a=10;
	
	private class Hello{
		public static void main() {
			System.out.println("Hello");
		}
	}
	
	public Private() {
		
	}
	
	private Private(int a) {
		
	}
	
	public static void main(String[] args) {
		System.out.println("Hello world "+ a);
		Hello.main();
	}
}
