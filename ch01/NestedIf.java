package ch01;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("������ �Է��ϼ��� : ");
		int score = scanner.nextInt();
		System.out.println("�г��� �Է��ϼ��� : ");
		int year = scanner.nextInt();

		if (score >= 60) {
			if (year != 4) {
				System.out.println("�հ� !! ");
			} else if (score >= 70) {
				System.out.println("�հ� !! ");
			} else {
				System.out.println("���հ�.. ");
			}
		} else {
			System.out.println("���հ�..");
		}
		scanner.close();
	}

}
