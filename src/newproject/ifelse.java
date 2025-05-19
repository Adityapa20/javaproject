package newproject;
import java.util.*;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		
		char Gender = 'F';
		System.out.println("enter your Marks: " );
		int marks = sc.nextInt();
	
		
		
		if(Gender =='M') {
			System.out.println("Gneder is " + Gender);
			
		}else {
			System.out.println("gneder is " + Gender);
		}
		
		if(marks < 35) {
			System.out.println("your fail in");
		}if(marks >35 && marks<75) {
			System.out.println("your PSss in second class : ");
		}if(marks > 75) {
			System.out.println("your pass in first class: ");
		

	}
	}
	

}
