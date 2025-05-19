package collection1;

public class Eg5 {

	public static void main(String[] args) {
		int row = 9;
		int star = 1;
		int space = 0;
		for(int i = 1; i<=row;i++) {
			for(int j = 1;j<=star;j++) {
				System.out.print(" *");
			}
			System.out.println();
			
			star++;
			
		

		}
		for(int i1 = 1; i1<=row;i1++) {
			for(int j = 1;j<=star;j++) {
				System.out.print(" *");
			}
			System.out.println();
			
			
			star--;
			
			
	}
		

}
}