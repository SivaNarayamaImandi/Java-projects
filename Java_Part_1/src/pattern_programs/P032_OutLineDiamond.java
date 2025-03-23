package pattern_programs;

public class P032_OutLineDiamond {
	public static void main(String[] args) {
		int space = 4;
		int star = 1;
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("   ");
			}
			for (int j = 1; j <= star; j++) {
				if (j == 1 || j == star || i == 5 && j == 5) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			if (i <= 4) {
				space--;
				star += 2;
			} else {
				space++;
				star -= 2;
			}
			System.out.println();
		}
	}
}
