package ch01;

import java.util.Scanner;

public class ConEx02 {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ��� :");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();

		if (point >= 90) {
			System.out.println("A ���� �Դϴ�!");
		} else if (point >= 80) {
			System.out.println("B ���� �Դϴ�!");
		} else if (point >= 70) {
			System.out.println("C ���� �Դϴ�!");
		} else if (point >= 60) {
			System.out.println("D ���� �Դϴ�!");
		} else {
			System.out.println("F ���� �Դϴ٤̤�");
		}
	}
}