package types_of_methods;

public class MethodWithArgAndWithReturnType {
	// method with argument with return type

	public static double addition(int i, double j, int l, char a) {
		double k = i + j - l + a;// 10+10.5-10+65-->75.5
		return k;// 75.5
	}

	public static void main(String[] args) {
		System.out.println("Main Starts");

		// 1 way store in a variable

		double j = addition(10, 10.5, 10, 'A');
		System.out.println(j);

		// 2nd way use in the printing statement

		System.out.println(addition(10, 10.5, 10, 'A'));

		// 3rd way use in conditional statements

		if (addition(10, 10.5, 10, 'A') < 70)// 75.5<70--> false
		{
			System.out.println("it is true");
		} else if (addition(10, 10.5, 10, 'A') != 75.5)// 75.5!=75.5--> false
		{
			System.out.println("it is not true");
		} else {
			System.out.println("hello");
		}

		System.out.println("Main Ends");
	}

}
