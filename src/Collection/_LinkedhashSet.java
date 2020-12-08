package Collection;

import java.util.LinkedHashSet;

public class _LinkedhashSet {
	public static void main(String[] args) {

		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("abc");
		lhs.add(100);
		lhs.add(100);
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);
		
		

	}
}
