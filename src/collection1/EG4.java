package collection1;

public class EG4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int row  = 5;
       int number = 1;
       char chr = 'A';
       for(int i = 1; i<=row ; i++) {
    	   for(int j = 1;j<=number;j++) {
    		   
    		   System.out.print(j + " ");
    	   }
    	   System.out.println();
    	   number ++;
       }
       System.out.println("::::::::::::::::::::::::::::::::::::::::::");
       
       
       for(int i = 1;i<=6;i++) {
    	   for(int chars = 1;chars<=i;chars++) {
    		   System.out.print(chr + " ");
    		   chr++;
    	   }
    	   System.out.println();
       }
       
       
       
	}

}
