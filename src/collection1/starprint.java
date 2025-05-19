package collection1;

public class starprint {
	public static void main(String[] args) {
		int row  = 7;
		int star = 13;
		int space = 0;
		
		for(int i = 1;i<= row;i++) {
			for(int j = 1; j<=space;j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k<=star; k++) {
				
				System.out.print("*");
			}
			
			System.out.println();

			star -=2;
			space++;
			
		}
		
		for(int i = 1;i<= row;i++) {
			for(int j = 1; j<=space;j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k<=star; k++) {
				
				System.out.print("*");
			}
			
			System.out.println();

			star +=2;
			space--;
			
		}
			
	
	}
}