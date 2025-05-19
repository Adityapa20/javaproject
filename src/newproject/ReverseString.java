package newproject;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String name  = "madam"; /// tihoR
   
       String name1=  "";
       
       for(int i = name.length()-1; i>=0; i--) {
    	   
    	    name1 += name.charAt(i);
    	   
       }
       if(name1.equalsIgnoreCase(name)) {
    	   System.out.println("Given String is palindrome String: ");
       }
       else {
    	   System.out.println("given string is not palindrome?");
       }
	}

}
