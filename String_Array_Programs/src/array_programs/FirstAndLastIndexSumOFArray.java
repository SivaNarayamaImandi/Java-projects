package array_programs;

public class FirstAndLastIndexSumOFArray 
{
	public static void main(String[] args) {
		//WAPTP sum of 1st and last elements of an double array
		double[] d=ArrayUtil.getDoubleArray();
		ArrayUtil.printDoubleArray(d);
		double a=d[0]+d[d.length-1];
		System.out.println();
		System.out.println(a);
	}
}
