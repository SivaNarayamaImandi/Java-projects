package basic_programs;

public class Demo 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int i[]=new int[5];
		i[0]=23;
		i[1]=25;
		i[2]=43;
		i[3]=45;
		i[4]=8;
		System.out.println(i[0]);
		System.out.println(i[1]);
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println(i[4]);
		
		System.out.println("-----------");
		for(int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}
		System.out.println("-----------");
		for (int j : i) {
			System.out.println(j);
		}
		String a="s";
	}
}
