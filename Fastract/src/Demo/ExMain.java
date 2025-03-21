package Demo;


public class ExMain {
	public static void main(String[] args) {
		try {
			System.out.println(5/0);
			EcceptionPro e = new EcceptionPro();
			throw e;
		} catch (EcceptionPro e) {
			System.out.println("hello");
			e.printStackTrace();
		}
	}
}
