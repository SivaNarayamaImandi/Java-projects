package Demo;

public class CheckingConditions {

	public static void evenOrOdd(int i) {
		if (i % 2 == 0) {
			System.out.println("Given number is Even");
		} else {
			System.out.println("Given number is Odd");
		}
	}

	public static void divisibleBy3(int i) {
		if (i % 3 == 0) {
			System.out.println("Given number is divisible by 3");
		} else {
			System.out.println("Given number is not divisible by 3");
		}
	}

	public static void main(String[] args) {
		evenOrOdd(9);
		divisibleBy3(10);
	}
}
