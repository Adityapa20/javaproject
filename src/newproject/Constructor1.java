package newproject;
import java.util.*;

public class Constructor1 {

    private static final String Aditya = null;
	private static final String Pachpor = null;

	// Global variables
    static String name;
    static String surname;
    static String mobilenum;
    static String nama = "tiger Bam";
    
    

    public static void main(String[] args) {
//        signup(); // Call the signup method first
        Constructor1 t1 = new Constructor1();
        signin(); // Then, call the signin method

    }

    // Signup method  
    public Constructor1(String name,String surname, String mobilenum) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your signup details: ");

        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your surname: ");
        surname = sc.nextLine();

        System.out.print("Enter your number: ");
        mobilenum = sc.nextLine();

        while (mobilenum.length() != 10) {
            System.out.println("number entered is incorrect. Please enter a valid 10-digit number.");
            System.out.print("Enter your number: ");
            mobilenum = sc.nextLine(); 
        }

        System.out.println("Your account has been successfully signed up!");

    }

    public Constructor1() {
		// TODO Auto-generated constructor stub
	}

	// Signin method
    public static void signin() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your login details: ");

        System.out.print("Enter your name: ");
        String user_inp = sc.nextLine();

        System.out.print("Enter your surname: ");
        String user_surname = sc.nextLine();
 
        System.out.print("Enter your number: ");
        String user_mobilenum = sc.nextLine();

        // Validate login credentials
        while (!user_inp.equals(name) || !user_surname.equals(surname) || !user_mobilenum.equals(mobilenum)) {
            System.out.println("Your login details are not valid.");
            System.out.println("Please try again.");

            // Ask for input again if the details are incorrect
            System.out.print("Enter your name: ");
            user_inp = sc.nextLine();

            System.out.print("Enter your surname: ");
            user_surname = sc.nextLine();

            System.out.print("Enter your number: ");
            user_mobilenum = sc.nextLine();
        }

        System.out.println("Login successful!");

        // Close the scanner when all operations are done
        sc.close();
    }
}
