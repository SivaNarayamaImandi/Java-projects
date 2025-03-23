package pattern_programs;

public class P033_SerialNumberVerical {
	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {
			int x = i;
			for (int j = 6; j >= 1; j--) {
				if (i <= j) {
					System.out.print(" " + x + " ");
					x += j;
				}
			}
			System.out.println();
		}
	}
}
