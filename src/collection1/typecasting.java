package collection1;


abstract class f1{
	 String name;
	public f1(String name) {
		this.name = name;
		System.out.println(name);
		// TODO Auto-generated constructor stub
	}
	
	abstract void add();
	abstract  void add1();
	abstract int SUb();
	public abstract void sub1();
	

}

class f2 extends f1{ //concreate class

	public f2(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void add1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	int SUb() {
		int a,b;
		a  = 90;
		b = 80;
		
		// TODO Auto-generated method stub
		return a+b;
	}
	public void sub1() {
		
	}
	
}
interface Dam{
	 static final int num = 0;
	void m1();
	 void m2();
	 
	 static void m3() {
		 System.out.println("Helllo world:::");
		 
	 }
}
class Dam1 implements Dam{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("Dam1");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2");
	}
	
}
public class typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    f2 obj = new f2("ADA");
	    f2 obj1 = new f2("ADA");
	    System.out.println(obj.SUb());
	    
	    Dam1 obj11 = new Dam1();
	    obj11.m1();
	    obj11.m2();
	    
	    
	}

}
