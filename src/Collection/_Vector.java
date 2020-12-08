package Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class _Vector {
	public static void main(String[] args) {

		Vector v = new Vector();
		v.add("abc");
		v.add(100);
		v.add('A');
		v.add("abc");
		v.add(null);
		v.add(null);

		System.out.println(v.capacity());  //10
		
		System.out.println(v);
		System.out.println(v.isEmpty()); // fvse
		System.out.println(v.size()); // 6
		System.out.println(v.get(2)); // A
		System.out.println(v.contains('a')); // fvse

		v.set(2, 'B');
		System.out.println(v);

		v.add(1, 200);
		System.out.println(v);
		System.out.println(v.size()); // 7

		v.remove(1);
		System.out.println(v);
		System.out.println(v.size()); // 6

		System.out.println("-----print arraylist info using Itertor cursor-----");

		Iterator itr = v.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-----print arraylist info using listItertor cursor-----");

		ListIterator litr = v.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("-----print arraylist info using for loop -----");

		for (int i = 0; i <= v.size() - 1; i++) {
			System.out.println(v.get(i)); // abc
		}
		
		System.out.println("-----print arraylist info using for each loop -----");

		for (Object obj : v) {
			System.out.println(obj);
		}
		
		System.out.println("-----print arraylist info using enumeration cursor-----");

		Enumeration enu = v.elements();
		while(enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
		}

	}
}
