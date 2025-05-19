package collection1;

public class Polymorphism  {
	public static void main(String[] args) {
	Polymorphism obj = new Polymorphism();
	pply1 obb1 = new pply1();
	obj.add();
	obj.add(12);
	obj.add(12);
	pply1 pply1 = new pply1();
	pply1.ada1();
	Polymorphism.add1();
		
	}
	
	public void ada1() {
		// TODO Auto-generated method stub
		
	}

	public void add(int A) {
		System.out.println("add");
		System.out.println(A);
	}
	public void add() {
		System.out.println("ADD2");
		
	}
	static void add1() {
		System.out.println("NO");
	}

}

class pply1 extends Polymorphism{
	@Override
	public void add(int A) {
		System.out.println("adadad" + A);
		
	}
	
     static void add1() {
		System.out.println("yes");
		// TODO Auto-generated method stub
	}
}