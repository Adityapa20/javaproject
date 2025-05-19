
public class pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row = 7;
		int star = 6;
		int space = 1;

		for (int i = 1; i <= row; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");

			}
			for (int k = 1; k <= star; k++) {
				System.out.print("*");
			}
			System.out.println();
			if (i < 4) {
				space++;
				star -= 2;
			} else {
				space--;
				star += 2;
			}

		}
	}

}
