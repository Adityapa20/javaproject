package collection1;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> Al = new ArrayList();

		Al.add(344);
		Al.add(3244);
		Al.add(9344);
		Al.add(35344);
		Al.add(11344);
		Al.add(134344);

		for (int i = 0; i < Al.size() - 1; i++) {
			for (int j = 0; j < Al.size() - 1 - i; j++) {
				if (Al.get(j) > Al.get(j + 1)) {
					int temp = Al.get(j);
					Al.set(j, Al.get(j + 1));
					Al.set(j + 1, temp);

				}
			}
		}
		System.out.println("sorted ArrayList + " +    Al);

	}

}
