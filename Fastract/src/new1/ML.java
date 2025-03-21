package new1;

public class ML {
	public void sum()
	{
		int a,b;
		a=10;b=20;
		System.out.println(a+b);
	}
	private static int sum(int a)
	{
		return a;
	}
	public static void main(String[] args) {
		ML m=new ML();
		m.sum();
		
		int a=sum(10);
		System.out.println(a);
		if(sum(10)==10)
			System.out.println(true);
		else
			System.out.println(false);
		
		System.out.println(sum(10));
	}
}
