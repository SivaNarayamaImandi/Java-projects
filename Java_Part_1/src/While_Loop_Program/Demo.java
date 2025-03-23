package While_Loop_Program;

public class Demo {
	public static void main(String[] args) {
		int num = 1123876;
		boolean inc = true;
		int temp = num;
		int cd = 10;
		while (temp != 0) {
			if (temp % 10 <= cd)
				cd = temp % 10;
			else {
				inc = false;
				break;
			}
			temp /= 10;
		}
		cd = 0;
		temp = num;
		boolean dec = true;
		while (temp != 0) {
			if (temp % 10 >= cd)
				cd = temp % 10;
			else {
				dec = false;
				break;
			}
			temp /= 10;
		}
		if (inc)
			System.out.println("Increment");
		else if (dec)
			System.out.println("dec");
		else
			System.out.println("Boun");
	}

}
