package ArrayListConcept;

import java.util.ArrayList;

public class New {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		for (Integer integer : al) {
			if(integer==30)
				al.remove(integer);
		}
		System.out.println(al);
	}
}
