package collection1;
public class Startprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      int arr[] = {44,55,33,11,444,5,8888,7,666666666,4,46677788};
	      int temp = arr[10];
	      for(int i = 0; i< arr.length;i++){
	          if(arr[i] <  temp) {
	              temp = arr[i];
	          }

	      }
	      System.out.println("max num" + " " + temp);
	      
     
	}

}
