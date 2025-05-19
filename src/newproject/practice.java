package newproject;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       signup();
	}
	public static void signup() {
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("enter your name : ");
		String user_name = sc.nextLine();
		
		System.out.println("enter your surname : ");
		String user_surname = sc.nextLine();
		
		System.out.println("enter your mobile number : ");
		String  mobnum = sc.nextLine();
		if(mobnum.length() !=10) {
			System.out.println("mobile number is Not valid: "
					+ " enter 10 digit number valid ");
			String  mobnum = sc.nextLine();

		}else {

 
		}
	System.out.println("enter your mailid :  ");
	String mailid = sc.nextLine();
	if(mailid.contains("@")) {
		System.out.println("Account openimg Succesfully:  ");
	}
	else {
		signup();
	}
		
		
		
	}
    
}
