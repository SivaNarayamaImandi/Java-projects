package ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListCRUD {
	public static void main(String[] args) {
		List li = new ArrayList();
		li.add(10);
		li.add(39);
		li.add(69);
		li.add(984);
		li.add(901);
		li.add(10);

		System.out.println("Create Operation : " + li);
//		int i = (int) li.get(0);
//		System.out.println(i);
		System.out.println("Read Operation : "+li.get(0));
		
		li.set(4, 7983);
		System.out.println("Update Operation : "+li);
		
//		li.add(0, 20);
//		System.out.println(li);
		
		li.remove(4);
		System.out.println("Delete Operation : "+li);
		li.remove(new Integer(10));
		System.out.println("Delete Operation : "+li);
		int of = li.indexOf(100);
		System.out.println(of);
		System.out.println(li.isEmpty());
		System.out.println(li.size());
		
		System.out.println(li.contains(100));
	}
}
