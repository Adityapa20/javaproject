package collection1;

interface intr{
	  void add();
	  
	  static  void add1() {
		  System.out.println("add1");
	  }
}

interface intr1 extends intr{
	int num1 = 99;

	public void add();
	
}

interface intr2 extends intr, intr1{   
	@Override
	abstract void add() ;
	
	
}

class intr3 implements intr2{

	@Override
	public void add() {
		System.out.println("intr3 add method: ");
		System.out.println(num1);
		// TODO Auto-generated method stub
		
	}
	
}
abstract class  abst1{
	int num = 88;
	abstract void addd();
	 void addd1() {
		 System.out.println("abst1 from addd1::");
	 }
	 
	
}
class abst2 extends abst1{

	@Override
	void addd() {
		System.out.println("abst2  addd");
		System.out.println(num);
		// TODO Auto-generated method stub
		
	}
	
}
public class Abstrac_and_interface {

	public static void main(String[] args) {
		intr3 obj  = new  intr3();
		obj.add();
		
		abst2 obj1 = new abst2();
		obj1.addd();
		// TODO Auto-generated method stub

	}

}
