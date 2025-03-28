package pattern_programs;

public class P030_LeftRightSolidTriangles {
	public static void main(String[] args) {
		int space = 8;
		int star = 1;
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= star; k++) {
				System.out.print(" * ");
			}
			for (int j = 1; j <= space; j++) {
				System.out.print("   ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print(" * ");
			}
			System.out.println();
			space -= 2;
			star++;
		}
	}
}
