
public class FirstPattern {
	public static void main(String[] args) {
		int numberofrows = 5;
		for (int i = 0; i < numberofrows; i++) {
			for (int j = numberofrows - i; j > 1; j--) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {

				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
