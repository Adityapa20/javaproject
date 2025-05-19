package collection1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arrlist = new ArrayList<>();

		arrlist.add(33);
		arrlist.add(3355);
		arrlist.add(33235678);
		arrlist.add(336);
		arrlist.add(3345);
		arrlist.add(33459);
//		boolean yesno = false;
//		Iterator<Integer> itr = arrlist.iterator();
//		
//		  while(itr.hasNext()) {
//	            Integer num = itr.next();  // Call next() only once per iteration
//	            System.out.print("   "  +  num);
//	            if(num.equals(33)) {       // Check if the number is 33
//	                yesno = true;
//	            }
//	        }
//
//	        if(!yesno) {
//	            System.out.println("not");
//	        } else {
//	            System.out.println("yes");
//	        }

		for (int i = 0; i < arrlist.size() - 1; i++) {
			for (int j = 0; j < arrlist.size() - 1 - i; j++) { // Fixed inner loop
				if (arrlist.get(j) < arrlist.get(j + 1)) { // Compare adjacent elements
					// Swap elements
					int temp = arrlist.get(j);
					arrlist.set(j, arrlist.get(j + 1));
					arrlist.set(j + 1, temp);
				}
			}
		}

		// Print Sorted List
		System.out.println("Sorted List:");
		for (int num : arrlist) {
			System.out.println(num);
		}
	}
}