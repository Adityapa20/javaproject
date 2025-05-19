import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class JavaOverview {
	
	public static void main(String[] args) {
		ArrayList<Integer> arrlist = new ArrayList<Integer>();
		arrlist.add(22);
		arrlist.add(242);
		arrlist.add(566);
		arrlist.add(262);
		arrlist.add(262);
		System.out.println(arrlist.add(666));
		System.out.println(arrlist);
		
//		LinkedHashSet<String> ls = LinkedHashSet<String>();
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("aditya", 121);
		hm.put("sonali", 5);
		System.out.println(hm.containsKey("sonali"));
		System.out.println(hm.containsValue(5));
		
		
	}

}