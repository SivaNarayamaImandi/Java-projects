package array_programs;

public class SquareOfOwnElementArray 
{
	public static void main(String[] args) {
		//WAPTP assign square of its own element and assign to another array and print both the arrays
		int[] intArray = ArrayUtil.getIntArray();		
		int[] a=new int[intArray.length];
		for (int i = 0; i < intArray.length; i++) {
			a[i]=intArray[i]*intArray[i];
		}
		System.out.print("[");
		for (int i : intArray) {
			System.out.print(i+" ");
		}
		System.out.print("]");
		System.out.println();
		System.out.print("[");
		for (int i : a) {
			System.out.print(i+" ");
		}
		System.out.print("]");
	}
}
