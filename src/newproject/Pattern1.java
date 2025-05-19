package newproject;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int row = 9;
       int star = 1;
       int space = 0;
       int space1  = 8;
       
       for(int i = 0; i<row;i++) {
    	   for(int j = 0; j<star; j++) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
    	   star++;
       }
       
       for(int i = 0; i<row;i++) {
    	   for(int j = 0; j<star; j++) {
    		   System.out.print("*");
    	   }
    	   System.out.println();
    	   star--;
       }
	}
	

}
