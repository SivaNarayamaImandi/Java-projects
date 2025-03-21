package Demo;

import java.util.HashMap;
import java.util.TreeSet;

public class HashMapPro {
	public static void main(String[] args) {
		HashMap hm=new HashMap();
		hm.put(1, "Siva");
		hm.put(2, 96);
		hm.put("hai", true);
		System.out.println(hm);
		hm.remove(1,"Siva");
		hm.replace(2, 96,100);
		hm.put(2, 300);
		System.out.println(hm);
		
		TreeSet ts=new TreeSet();
		ts.add(12);
		ts.add(934);
		ts.add(90);
		System.out.println(ts);
	}
}
