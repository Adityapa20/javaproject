import java.util.Iterator;
import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeSet<Integer> ts = new TreeSet<>();
      
      ts.add(22);
      ts.add(252);
      ts.add(272);
      ts.add(292);
      ts.add(122);
      ts.add("adad");
      
      System.out.println(ts);
      
      for(int i=0;i<ts.size()-1;i++) {
    	  
      }
	  System.out.println(ts +" forloop");

      Iterator<Integer> ts1 = ts.iterator();
      while(ts1.hasNext()) {
    	  int num = ts1.next();
    	  if(num > 100) {
    		  ts1.remove();
    	  }
      }
      
      System.out.println("After removing" + ts);
	}

}
