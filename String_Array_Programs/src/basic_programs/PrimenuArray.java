package basic_programs;

public class PrimenuArray {
	public static void main(String[] args) {
		//WAPTP only prime numbers from an integer array
		int[] intArray = ArrayUtil.getIntArray();
		ArrayUtil.printIntArray(intArray);
		System.out.println();
		
		for (int i = 0; i < intArray.length; i++) {
			int j = intArray[i];
			int count=0;
			for (int x=1;x<=j;x++)
			{
				if(j%x==0)
				{
					count++;
				}
				
			}
			if(count==2)
			{
				System.out.println(intArray[i]);
			}
		}
		
	}
}
