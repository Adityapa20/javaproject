package collection1;

import java.util.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;
import java.util.ListIterator;

public class set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hm = new HashMap<>();
		hm.put(133, "aditya");
		hm.put(123, "akansha");
		hm.put(163, "india");
		hm.put(132, "prayagraj");
		
		System.out.println(hm);
		
		HashSet<Float> hs = new HashSet<Float>();
		
		hs.add(33.3f);
		hs.add(554.4f);
		hs.add(111.0f);
		
		System.out.println(hs);
		
		
		LinkedHashSet<String> lhs = new LinkedHashSet();
		lhs.add("mumbai");
		lhs.add("pune");
		lhs.add("aurangabad");
		lhs.add("akola");
		lhs.add("nagar");
		System.out.println(lhs.reversed());
		
		System.out.println();
		
		System.out.println(lhs.removeFirst());
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("india");
		ll.add("america");
		ll.add("pakaistan");
		ll.add("newlaznd");
		
		System.out.println( " peekfirst" + ll.peekFirst() );
		System.out.println(ll);
		System.out.println(" pollfirst"  + ll.pollFirst() );
		System.out.println(ll.descendingIterator());
		System.out.println(ll.reversed());
		
		System.out.println(ll.offerFirst("japan"));
		
		System.out.println(ll.poll());
		 ListIterator<String> litr = ll.listIterator();
		 
		 
		 while(litr.hasNext()) {
			 
			 System.out.println(litr.next());
			 litr.remove();
		 }
		
		
   System.out.println(ll);
		
	}
}
