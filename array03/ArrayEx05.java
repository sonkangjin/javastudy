package array03;

import java.util.Scanner;

public class ArrayEx05 {

	/*
	 * ���� 1000000000(10��) 3�ڸ����� �޸��� �� ���!! 1,000,000,000
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String tempNum = num + "";
		String tempNum2[] = tempNum.split("");

		int k = tempNum2.length;
		for (int i = 0; i < tempNum2.length; i++) {

			if ((k - i) % 3 == 0) {
				if (i != 0) {
					System.out.print(",");
					System.out.print(tempNum2[i]);
				} else {
					System.out.print(tempNum2[i]);
				}

			} else {
				System.out.print(tempNum2[i]);
			}

		}
	}

}
