package collection1;

class this1{
	
	 int num = 33;
	
		  public  void a1() {
			int num = 44;
			System.out.println(this.num); System.out.println(/*faydaa" : " of static directly call using name of class 
			*/
			
		}
		  public void a2() {
			  System.out.println(" from a2 from this1 class: :::::  ::   ");
		  }
	}
	
class super1 extends this1{
	   void addition() {
		   
		 int num = 55;
		 System.out.println(super.num);
		
		
	}
	 int  substraction() {
		 System.out.println("Hello world: :  : : : :");
		 
		 System.out.println(super.num + " substraaction: ");
		 return 1;
		 
	 }
abstract class aditya{

abstract void main2();
	
}

class aditya1 extends aditya{

	@Override
	void main2() {
		
		System.out.println("aditya abtract class");
	}
		// TODO Auto-generated method stub
		
	}
	
}
public class Thisandsuper {
       int num = 22;
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub

       super1 obj = new super1();
      obj.addition();
      obj.substraction();
      obj.a2();
      
        
	}

}
