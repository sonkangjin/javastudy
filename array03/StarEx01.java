package array03;

public class StarEx01 {
	// *
	// **
	// ***
	// ****

	static void printStars(int i) {
		for (int j = 0; j < i; j++) {// ���� ����
			System.out.print("*");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		//for (int a = 1; a < 5; a++) {// ���� ����
			//printStars(a);// ���� ����
		//}
		for (int i = 4; i >0; i--) {
			printStars(i);
		}
	}

}
