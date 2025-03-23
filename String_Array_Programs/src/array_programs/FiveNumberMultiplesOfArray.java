package array_programs;

public class FiveNumberMultiplesOfArray 
{
	//WAPTP multiples of 5 from an integer array
	public static void main(String[] args) {
		int[] intArray = ArrayUtil.getIntArray();
		ArrayUtil.printIntArray(intArray);
		System.out.println();
		for (int i = 0; i < intArray.length; i++) {
			if(intArray[i]%5==0)
			{
				System.out.println(intArray[i]);
			}
		}
		
	}
}
