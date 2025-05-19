package newproject;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row  = 9;
		
		int star = 1;
		
		int space = 8;
		
		for(int i = 0;i<row;i++) {
			for(int j =0;j<space; j++) {
				System.out.print(" ");
			}
			for(int k = 0;k<star;k++) {
				System.out.print("*");
			}
			System.out.println();
			space--;
			star++;
		}
		
		for(int i = 0;i<row;i++) {
			for(int j =0;j<space; j++) {
				System.out.print(" ");
			}
			for(int k = 0;k<star;k++) {
				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
		
		}
		
      
	}

}
