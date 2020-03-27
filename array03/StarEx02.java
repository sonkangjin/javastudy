package array03;

public class StarEx02 {

	static void printStars(int i) {

		for (int j = 0; j < 4 - i; j++) {
			System.out.print("_");
		}
		for (int k = 0; k < i; k++) {
			System.out.print("*");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		for (int i = 1; i < 5; i++) {
			printStars(i);
		}

	}

}
