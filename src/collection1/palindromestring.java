package collection1;

public class palindromestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int count = 0;
		for(int i =2;i<=100;i++) {
			if(i%i == 0) {
				count ++;
				if(count == 2)
				System.out.println(count);
			}
		}
	}

}
