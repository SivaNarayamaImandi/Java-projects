package recursion_programs;

public class Demo {
	static int i = 1;

	static void series() {
		if (i > 3) {
			return;
		} else {
			System.out.println(i);
			i++;
			series();
			System.out.println(--i);
		}
	}

	public static void main(String[] args) {
		series();
	}
}
