package newproject;
import java.util.*;


public class primenumber {
	
	static int nam   = 99; 
 //write nmber to chek prime or not
	public static void main(String[] args) {
		isleapyear();
	
	}
	public static void isleapyear() {
		int year;
		System.out.println("enter yeear to check: ");
		Scanner sc  = new Scanner(System.in);
		year = sc.nextInt();
		if(year % 4== 0 && year % 100 !=  year && year % 400 ==0) {
			System.out.println("this is leap year: " + year);
		}else {
			System.out.println("this is not leap year: " + year);
		}
	
	}

}
