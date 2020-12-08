package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class _Arraylist {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("abc");
		al.add(100);
		al.add('A');
		al.add("abc");
		al.add(null);
		al.add(null);

		System.out.println(al);
		System.out.println(al.isEmpty()); // false
		System.out.println(al.size()); // 6
		System.out.println(al.get(2)); // A
		System.out.println(al.contains('a')); // false

		al.set(2, 'B');
		System.out.println(al);

		al.add(1, 200);
		System.out.println(al);
		System.out.println(al.size()); // 7

		al.remove(1);
		System.out.println(al);
		System.out.println(al.size()); // 6

		System.out.println("-----print arraylist info using Itertor cursor-----");

		Iterator itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("-----print arraylist info using listItertor cursor-----");

		ListIterator litr = al.listIterator();
		while (litr.hasNext()) {
			System.out.println(litr.next());
		}

		System.out.println("-----print arraylist info using for loop cursor-----");

		for (int i = 0; i <= al.size() - 1; i++) {
			System.out.println(al.get(i)); // abc
		}
		
		System.out.println("-----print arraylist info using for each loop cursor-----");

		for (Object obj : al) {
			System.out.println(obj);
		}
		

	}
}
