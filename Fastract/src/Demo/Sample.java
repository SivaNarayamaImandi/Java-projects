package Demo;

public class Sample {

	public static int addition(int i, int j) {
		int k = i + j;
		return k;
	}

	public static int substraction(int i, int j) {
		int k = i - j;
		return k;
	}

	public static void main(String[] args) {

		if (addition(20, 10) <= substraction(30, 10)) {
			System.out.println("both are same");
		} else {
			System.out.println("both are not same");
		}
	}
}
