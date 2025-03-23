package pattern_programs;

public class P034_NumberPyramid {
	public static void main(String[] args) {
		int space=4;
		int star=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print("  ");
			}
			int x=1;
			int nu=i;
			int du=1;
			for(int j=1;j<=star;j++)
			{
				System.out.print(" "+x+"  ");
				x=(x*nu)/du;
				nu--;du++;
			}
			System.out.println();
			space--;
			star++;
		}
	}
}
