package Demo;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetPro {
	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(12);
		set.add("Tom");
		set.add(true);
		set.add(true);
		set.add(19.6);
		set.add(19.6);
		System.out.println(set);
		
		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add(12);
		lhs.add(true);
		lhs.add("Tom");
		lhs.add(90.6);
		System.out.println(lhs);
	}
}
