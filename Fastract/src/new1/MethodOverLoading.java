package new1;

public class MethodOverLoading {
	
	public static void add(int a,int b)
	{
		System.out.println(a+b);
		add(10, 20, 1113045676);
	}

	public static void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
		add(10, 20, 3456787654567899l);
	}
	public static void add(int a,int b,long c)
	{
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		add(10, 20);
		
		
	}
}
