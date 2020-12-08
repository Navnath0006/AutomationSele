package Collection;

import java.util.Iterator;
import java.util.TreeSet;

public class _TreeSet {
	public static void main(String[] args) {

		TreeSet tr = new TreeSet();
		tr.add(100);
		tr.add(50);
		tr.add(30);
		tr.add(200);
		tr.add(400);
		tr.add(300);
//	tr.add(null);
		System.out.println(tr); // [30, 50, 100, 200, 300, 400]
		tr.pollFirst(); // removes 1st element in treeset
		System.out.println(tr); // [50, 100, 200, 300, 400]

		tr.pollLast(); // removes last element in treeset
		System.out.println(tr); // [50, 100, 200, 300]

		System.out.println(tr.first()); // 50 get 1st element in treeset
		System.out.println(tr.last()); // 300 get last element in treeset

		System.out.println("----------------------");

		Iterator itr = tr.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}
}
