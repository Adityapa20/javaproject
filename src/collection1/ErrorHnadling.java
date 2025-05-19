package collection1;

public class ErrorHnadling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		int a = 10;
//		int b = 0;
////		int b1 = a/b;
//		System.out.println(b1);
		int arr[] = {12,44,4,5};
		
		
		try {
			System.out.println(arr[7]);
			
		} catch (IndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("index not found in array" + e.getMessage());
		}
		finally {
			
			System.out.println("try again");
			
		} 

	}

}
