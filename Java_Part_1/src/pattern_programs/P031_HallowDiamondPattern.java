package pattern_programs;

public class P031_HallowDiamondPattern {
	public static void main(String[] args) {
		int star = 5;
		int space = 0;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= star; j++) {
				System.out.print(" * ");
			}
			for (int j = 1; j <= space; j++) {
				System.out.print("   ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print(" * ");
			}
			if (i <= 4) {
				space += 2;
				star--;
			} else {
				space -= 2;
				star++;
			}
			System.out.println();
		}
	}
}
