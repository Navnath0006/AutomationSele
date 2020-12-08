package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class _hashset {
	public static void main(String[] args) {

		HashSet hs = new HashSet();
		hs.add("abc");
		hs.add(100);
		hs.add('A');
		hs.add("abc");
		hs.add(100);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
		
		System.out.println(hs.size()); // 4
		System.out.println(hs.isEmpty()); // false
		System.out.println(hs.contains(100)); // true
		hs.remove('A');
		System.out.println(hs);

		System.out.println("-----print hashset info using iterator------");

		Iterator itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("-----print hashset info using foreach loop------");

		for (Object ele : hs) {
			System.out.println(ele);
		}
		
		hs.clear();
		System.out.println(hs.size());   //0
		
		

	}
}
