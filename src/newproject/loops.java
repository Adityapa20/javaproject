package newproject;

import java.util.Scanner;

public class loops {
	loops(){
		System.out.println("Heelo Wrld");
	}
	
      static int num = 10;
      static int num1 = 90;     //global/static variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		loops t3 = new loops();
	     t3.sub();
	     t3.mult(22, 5);
		 add();


	    
	}
	public static void add() {
//		int num = 10;
//		int num1 = 90;
		float sum = num+num1;
		System.out.println(sum);
		
	}
	public void sub() {
		System.out.println(num-num1);
	}
	public void mult(int a, int b) {
		System.out.println(a*b);
//		System.out.println(sum); we dont call local vaariable here 
	}
	
	
	
}
