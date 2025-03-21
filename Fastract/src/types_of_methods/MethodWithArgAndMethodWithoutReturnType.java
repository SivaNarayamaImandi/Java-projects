package types_of_methods;

public class MethodWithArgAndMethodWithoutReturnType {
	public static void addtion(long l, int s, boolean b) {
		long j=l+s;
		b=true;
		System.out.println(j);
		System.out.println(b);
		System.out.println("Without return type");
	}

	public static void main(String args[]) {
		//addtion(10l,10,false);
		System.out.println("Main starts");
		System.out.println("Main ends");
		divisionOperation();
	}
	public static void divisionOperation()
	{
		int i=10;
		int j=15;
		int k=j/i;
		System.out.println(k);
	}
}
