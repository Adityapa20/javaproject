package newproject;

public class meth {
	static int num3 = 100;  //global static variable
	static int num4 = 50;  //global static
	int num5 = 500;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("hi");
		meth t1 = new meth();
		add(100,100);
		t1.sub();
		mult();
		A t2 = new A();
		t2.sub();
		
	}
	public static void add(int num , int num1) {
		int sum = num + num1;
		System.out.println("hello world");
		System.out.println(sum);
		System.out.println(num3 + " stastic method");
	}
	
	public void sub() {
		System.out.println("hello world frm non static");
		System.out.println(num3);
		System.out.println(num5);
//		System.out.println(num1);
	}
	public static void mult() {
		int sum1 = num3*num4;
		System.out.println(sum1 );
		int  num = 20;
		System.out.println(num);
		System.out.println(num4);
//		System.out.println(num5);
		
	}

}

 
