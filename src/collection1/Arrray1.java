package collection1;

public class Arrray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr = new int[5];
      arr[0] = 11;
      arr[1] = 12;  
      arr[2] = 34;
      arr[3] = 50;
      arr[4] = 60;
      
     int abc =  arr.length/2;
      
      
      for(int i = 0; i < arr.length-1;i++) {
    	  for(int j = 0; j <  arr.length-1-i;j++) {
    		  if(arr[j] < arr[j+1]) {
    			  int temp = arr[j];
    			  arr[j] = arr[j+1];
    			  arr[j+1] = temp;
    			  
    		  }
    		  
    	  }
    	  
    	 
    	  
    	  
      }
      for(int i = 0; i<arr.length-1;i++) {
		  System.out.println(arr[i]);
	  }
    	 

}
}