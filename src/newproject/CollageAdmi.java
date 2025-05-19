package newproject;
import java.util.*;

public class CollageAdmi {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        Studentinfo();

	}
	
	private static void Studentinfo() {
		 Scanner sc  = new Scanner(System.in);
	
		 System.out.println("enter your name: ");
		 String user_name = sc.nextLine();
		 
		 System.out.println("enter your surname: ");
		 String user_surname = sc.nextLine();
		 
		 System.out.println("enter your emailid: ");
		 String user_emailid = sc.nextLine();
		 
		 System.out.println("enter your mobile number: ");
		 String user_mobnum = sc.nextLine();
		 
		 
		 if(user_mobnum.length() != 10) {
			 System.out.println("mobile number is not valid: enter number Again:   ");
			 Studentinfo();

		 }else {
			 System.out.println("your admission  succefully Done: ");

		 }
	 
	}


}

