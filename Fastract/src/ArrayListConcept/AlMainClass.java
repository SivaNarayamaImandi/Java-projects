package ArrayListConcept;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AlMainClass {
	public static void main(String[] args) {
		AlEmployee al=new AlEmployee("Siva", 101, 1000, "HYD");
		AlEmployee al1=new AlEmployee("Ram", 102, 2000, "BLR");
		AlEmployee al3=new AlEmployee("Ram", 102, 2000, "BLR");
		AlEmployee al2=new AlEmployee("Sita", 103, 3000, "MUN");
		List<AlEmployee> li=new ArrayList<AlEmployee>();
		li.add(al);
		li.add(al1);
		li.add(al2);
		li.add(al3);
		Iterator<AlEmployee> iterator = li.iterator();
		
		while (iterator.hasNext()) {
			AlEmployee next = iterator.next();
			if(next.getId()==103) {
				iterator.remove();
			}
		}
		System.out.println(li);
	}
}
