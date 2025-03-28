package programs;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatting {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat i = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("US	: " + u.format(payment));
        System.out.println("India	: " + i.format(payment));
        System.out.println("China	: " + c.format(payment));
        System.out.println("France	: " + f.format(payment));
    }
}
