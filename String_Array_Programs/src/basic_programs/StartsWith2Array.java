package basic_programs;

public class StartsWith2Array 
{
	public static void main(String[] args) {
		//WAPTP array elements which starts witn no 2 from in int array
		int[] intArray = ArrayUtil.getIntArray();
		ArrayUtil.printIntArray(intArray);
		System.out.println();
		  for (int i = 0; i < intArray.length; i++) {
			  int num = intArray[i];
			  int rev=0;
			  while(num!=0)
			  {
				  int ld=num%10;
				  rev=rev*10+ld;
				  num/=10;
			  }
			  int s=0;
			  while(rev!=0)
			  {
				  int ld=rev%10;
				  s=ld;
				  break;
			  }
			  if(s==2)
			  {
				  System.out.println(intArray[i]);
			  }
		}
	}
}
