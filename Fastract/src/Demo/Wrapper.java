package Demo;

public class Wrapper {
	public static void main(String[] args) {
		// PD to NPD
		//Explicite
		int a=10;
		Integer i=new Integer(a);
		System.out.println(i);
		//Implicite
		Integer j=a;
		System.out.println(j);
		
		//NPD to PD
		//Explicite
		Character c=new Character('A');
		char c1=c.charValue();//no need to provide args
		System.out.println(c1);
		//implicite
		char c2=c;
		System.out.println(c);
		char c3=Character.valueOf('M');//need to provide args
		System.out.println(c3);
		
		Integer in=10;
		int in1=in;
		System.out.println(in1);
	}
}
