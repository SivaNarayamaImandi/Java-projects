package array_programs;

public class PrintEvenElements 
{
	//PRINT EVEN ELEMENTS
	public static void main(String[] args) {
		int[] j= {2,4,65,5,3,6};
		for (int i = 0; i < j.length; i++) {
			if(j[i]%2==0)
			{
				System.out.println(j[i]);
			}
		}
	}
}
