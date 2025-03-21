package Demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMain {
	public static void main(String[] args) {
		ArrayListUsage ar = new ArrayListUsage();
		ar.setId(11);
		ar.setName("Siva");
		ar.setSal(25000);
		ar.setLocation("Hyd");
		ArrayListUsage ar1 = new ArrayListUsage();
		ar1.setId(112);
		ar1.setName("Siva1");
		ar1.setSal(15000);
		ar1.setLocation("Bng");
		ArrayList<ArrayListUsage> arr = new ArrayList<ArrayListUsage>();
		arr.add(ar);
		arr.add(2, ar1);
		Iterator<ArrayListUsage> iterator = arr.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getId() == 11) {
				iterator.remove();
				System.out.println("Object removed succcfull");
				break;
			}
		}
		for (ArrayListUsage arrayListUsage : arr) {
			System.out.println(arrayListUsage);
		}
	}
}
