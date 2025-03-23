package For_Loop_programs;

import java.util.Scanner;

public class P011_Tables {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Which table you want : ");
		int table = sc.nextInt();
		System.out.print("How much length you want(10 or 20 etc..) : ");
		int length = sc.nextInt();
		for (int i = 1; i <= length; i++) {
			System.out.println(table + " * " + i + " = " + i*table);
		}
		sc.close();
	}
}
