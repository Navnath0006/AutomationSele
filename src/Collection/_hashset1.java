package Collection;

import java.util.ArrayList;
import java.util.HashSet;

public class _hashset1 {
public static void main(String[] args) {
	
	ArrayList al=new ArrayList();
	al.add(100);
	al.add(200);
	al.add(300);
	al.add(100);
	al.add(200);
	al.add(100);
	al.add(200);
	System.out.println(al);
	

	
	
	HashSet hs=new HashSet(al);
	System.out.println(hs);
	
	
	
	
	
}
}
