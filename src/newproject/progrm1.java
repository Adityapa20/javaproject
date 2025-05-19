package newproject;

public class progrm1 {
	public static void main(String[] args) {
		
		String name = " V k  rkfr rr";
		
		
		int count = 0;
		
		for(int i = 0;i < name.length()-1;i++) {
			if(name.charAt(i) == 'r') {
				count++;
			}
		
		}
		
		System.out.println("cout of space is"  +  " " + count);
		
	}

}
