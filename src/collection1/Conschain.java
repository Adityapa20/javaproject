package collection1;

class chain{
	String name;
	int roll_no;
	
	
	public chain(String name,int roll_no) {
		this.name = "ADItya";
		this.roll_no = 99;
		System.out.println(name + " " +  roll_no);
		// TODO Auto-generated constructor stub
	}
	public chain() {
		this("kaka", 20);
		// TODO Auto-generated constructor stub
	}
}

public class Conschain extends chain {
	

	public Conschain(String name, int roll_no) {
		super(name, roll_no);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conschain obj1 = new Conschain("suraj", 19);
		

	}

}
