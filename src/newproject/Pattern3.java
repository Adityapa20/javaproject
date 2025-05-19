package newproject;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row = 7;
		int star = 1;
		int  space = 6;
		
		for(int i = 0; i<row;i++) {
			for(int j = 0;j<space;j++) {
				System.out.print(" ");
				
			}
			for(int k = 0; k<star;k++) {
				System.out.print("*");
			}
			System.out.println();
		
			space--;
			star+=2;
			
		}
		for(int i = 0; i<row;i++) {
			for(int j = 0;j<space;j++) {
				System.out.print(" ");
				
			}
			for(int k = 0; k<star;k++) {
				System.out.print("*");
			}
			System.out.println();
		
			space++;
			star-=2;
		}
	}

}
