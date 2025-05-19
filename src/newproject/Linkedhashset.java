import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		
		lhs.add("adityaa");
		lhs.add("indian");
		lhs.add("USA");
		
		System.out.println(lhs.getFirst());
		System.out.println(lhs.remove("adityaa"));
		System.out.println(lhs);
   
	}

}
