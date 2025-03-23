package pattern_programs;

public class P027_LeftRightCombinationPyramidPattern {
	public static void main(String[] args) {
		int space = 4, star = 1;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("   ");
			}
			for (int k = 1; k <= star; k++) {
				System.out.print(" * ");
			}
			if (i <= 4) {
				space--;
				star += 2;
			} else {
				star -= 2;
				space++;
			}
			System.out.println();
		}
	}
}
