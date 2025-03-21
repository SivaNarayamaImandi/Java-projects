package Demo;

public class XYZ {
	public static void main(String[] args) {
		int s = 1;
		System.out.println(s);
		// Boxing
		//Explicite
		Integer i = new Integer(s);
		System.out.println(i);
		//Iimplicite
		Integer j = s;
		System.out.println(j);
		
		//Unboxing
		//Explicite
		int k = i.intValue();
		System.out.println(k);
		//Implicite
		int l=i;
		System.out.println(l);
	}

}
