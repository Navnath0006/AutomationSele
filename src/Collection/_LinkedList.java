package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class _LinkedList {
	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		ll.add("abc");
		ll.add(100);
		ll.add('A');
		ll.add("abc");
		ll.add(null);
		ll.add(null);

		System.out.println(ll);
		System.out.println(ll.isEmpty()); // fllse
		System.out.println(ll.size()); // 6
		System.out.println(ll.get(2)); // A
		System.out.println(ll.contains('a')); // fllse

		ll.set(2, 'B');
		System.out.println(ll);

		ll.add(1, 200);
		System.out.println(ll);
		System.out.println(ll.size()); // 7

		ll.remove(1);
		System.out.println(ll);
		System.out.println(ll.size()); // 6

		System.out.println("-----print arraylist info using Itertor cursor-----");

		Iterator itr = ll.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-----print arraylist info using listItertor cursor-----");

		ListIterator litr = ll.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("-----print arraylist info using for loop cursor-----");

		for (int i = 0; i <= ll.size() - 1; i++) {
			System.out.println(ll.get(i)); // abc
		}
		
		System.out.println("-----print arraylist info using for each loop cursor-----");

		for (Object obj : ll) {
			System.out.println(obj);
		}
		

	}
}
