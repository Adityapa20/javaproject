package collection1;

import java.util.ArrayList;

public class collec1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> arrlist = new ArrayList<>();
		//sorting arraylist 
		
		
		arrlist.add(2);
		arrlist.add(445);
		arrlist.add(919);
		arrlist.add(299);
		arrlist.add(979);
		arrlist.add(990);
		
		System.out.println(arrlist);
		
     for(int i = 0; i<=arrlist.size()-1;i++) {
    	 for(int j = 0; j< arrlist.size()-1-i;j++) {
    	 if(arrlist.get(j) > arrlist.get(j+1)) {
    		 
    	 
    		 int temp = arrlist.get(j);
    		 arrlist.set(j, arrlist.get(j+1));
    		 arrlist.set(j+1,temp );
    		 
    		 
     }
	}
    	 
     }
     System.out.println("sorted arraylist" + arrlist);
     
	}

}
