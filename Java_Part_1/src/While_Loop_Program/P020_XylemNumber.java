package While_Loop_Program;

import java.util.Scanner;

public class P020_XylemNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		int temp = num;
		int exstream = 0;
		int mean = 0;
		while (temp != 0) {
			if (temp < 10 || temp == num) {
				exstream += temp % 10;
			} else {
				mean += temp % 10;
			}
			temp /= 10;
		}
		if (exstream == mean)
			System.out.println("yes");
		else
			System.out.println("no");
		sc.close();
	}
}
