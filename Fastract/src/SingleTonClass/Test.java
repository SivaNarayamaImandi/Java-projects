package SingleTonClass;

public class Test {
	public static void main(String[] args) {
		Demo.createAadhar(); //1
		System.out.println("-------------");
		Demo.createAadhar(); //2
		Demo.createAadhar(); //2
		Demo.createAadhar(); //2
		Demo.createAadhar(); //2
		Demo.createAadhar(); //2
		Demo.createAadhar(); //2
		Demo.createAadhar(); //2
		Demo.createAadhar(); //2
	}
}
