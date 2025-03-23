package pattern_programs;

public class Demo1 {
	public static void main(String[] args) {
		int star=5;
		int space=0;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print(" * ");
			}
			for(int k=1;k<=space;k++)
			{
				System.out.print("   ");
			}
			for(int l=1;l<=star;l++)
			{
				System.out.print(" * ");
			}
			if(i<=4)
			{
				space+=2;
				star--;
			}
			else {
				space-=2;
				star++;
			}
			System.out.println();
		}
	}
}
