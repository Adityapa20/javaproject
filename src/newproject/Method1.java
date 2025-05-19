package newproject;


class AB{
	 void add() {
		System.out.println("hello from add AB class:  ");
	}
	
	public static void sub() {
		System.out.println("heeelo form sub");
	}
	
}
class ABC extends AB{
	public static void sub() {
		System.out.println("hhhhhhh");
	}
	void add() {
		System.out.println("hii addd form ABC classs: ");
		
	}
	
	static int mult() {
		return 1;
	}
}
public class Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AB obj = new ABC();
		
		obj.add();
		AB.sub();
		ABC.sub();
		int  abb = ABC.mult();
		System.out.println(abb);
		

	}
	
	
	

}
