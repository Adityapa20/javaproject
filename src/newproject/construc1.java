package newproject;

public class construc1 {
	static int aka =99;
	String numu  = "akansha";
	 static String nama = "Tiger Bam";
	 static int ranga;
	 static int num6;
	
	public construc1() {
		// TODO Auto-generated constructor stub
		
		System.out.println("constructor: first line: ");
	}
	public construc1(int num2, int num3) {
		int sum = num2 + num3;
		System.out.println(sum);
	}
	public static void  add(int a, int b) {
		System.out.println("this is add method: ");
		ranga = a;
		a = num6;
				System.out.println(ranga + "this is ranga: ");
				System.out.println(a + "this is a: ");
		int sum = a+b;
		System.out.println(sum);
		System.out.println(nama);
		
		
	}
	
	public void name1() {
		int y = 878;
		y = aka;
		int z = 122;
		int sum1 = y+z;
		System.out.println(sum1);
		System.out.println("name1");
//		System.out.println(nama);
		if( nama instanceof String) {
			System.out.println("Given Variale Is String:::::");
		}
		else {
			System.out.println("Given variable type is not String:: ");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new construc1();
		construc1 t2 = new construc1(55, 44);
		add(33, 883);
		new construc1();
		t2.name1();
		construc1 t6 = new construc1();
		System.out.println(t6.numu);

	}
	
	
}
