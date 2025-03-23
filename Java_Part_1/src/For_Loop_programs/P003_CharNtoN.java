package For_Loop_programs;

import java.util.Scanner;

public class P003_CharNtoN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter start character 'A' or 'a' : ");
		char start = sc.next().charAt(0);
		System.out.print("Enter end character 'Z' or 'z' : ");
		char end = sc.next().charAt(0);
		for (char i = start; i <= end; i++)
			System.out.print(i + " ");
		sc.close();
	}
}
