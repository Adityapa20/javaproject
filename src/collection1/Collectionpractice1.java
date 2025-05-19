package collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Collectionpractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       // collection 
		
		ArrayList<Integer> list = new ArrayList<>();
		Vector<Integer> vc = new Vector<>();
		vc.add(333);
		vc.add(335);
		vc.add(3366);
		vc.add(393);
		vc.add(300033);
		
		Enumeration<Integer> EM = vc.elements();
		
		while (EM.hasMoreElements()) {
			System.out.println(EM.nextElement());
			
		}
		System.out.println(vc.);
		
		list.add(22);
		list.add(222);
		list.add(222);
		list.add(223);
		list.add(21232);
		list.add(223123);
		list.add(213132);
		list.add(2277);
		System.out.println(list.size() + " size of list");
		
		
		
		System.out.println(list.indexOf(22));
		System.out.println(list.lastIndexOf(list));
		System.out.println(list.removeLast());
		
		  
		  System.out.println(list.set(1, 3333));
		  System.out.println(list);
		  Collections.sort(list);
		  System.out.println(list.subList(0, 7));
        
		  for(int i = list.size()-1; i>=0 ;i--) {
			  System.out.print(list.get(i) + " ,");
		  }
		  
		
		
		
		
		
	}

}
