package array03;

import java.util.Scanner;

public class ArrayEx06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("6�ڸ� ���ڸ� �Է��ϼ���.");
		int num = sc.nextInt();

		String strNum = num + "";
		System.out.println(strNum.charAt(2));// ��ġ�� �ִ� ���� ã��
		System.out.println(strNum.length());// ���� ���

		int a = 0;
		for (int i = 0; i < strNum.length(); i++) {
			if (strNum.charAt(i) == '3') {
				a++;
			}
		}
		if (a > 0) {
			System.out.println("3�� �����մϴ�.");
		} else {
			System.out.println("3�� �������� �ʽ��ϴ�.");
		}
	}

}
