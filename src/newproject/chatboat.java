package newproject;
import java.util.Scanner;

public class chatboat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String user_input;
      System.out.println("Hello i am your chat boat how can you help you");
      
      while(true) {
    	  user_input = sc.nextLine();
    	  if(user_input.equalsIgnoreCase("Exit")) {
    		  System.out.println("Good Bye: HAve great Days: ");
    		  break;
    	  }
    	  if(user_input.contains("hi") | user_input.contains("Hello")) {
    		  System.out.println("Boat there hello");
    		  
    	  }else if(user_input.contains("how are you")) {
    		  System.out.println("hey i am just program: ");
    		  
    	  }else if (user_input.contains("your name")) {
    		  System.out.println("i am chatboat")
    		  ;
    	  }else {
    		  System.out.println("boat:  i am aware how to resond");
    		  
    	  }
      }
//            scanner.close();
	}

}
