package ch01;

import java.util.Scanner;

public class ConEx03 {

	public static void main(String[] args) {
		System.out.println("������ �Է��ϼ��� :");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();

		if (point<=100&&point >= 90) {
			System.out.println("A ���� �Դϴ�!");
		} else if (point<90&&point >= 80) {
			System.out.println("B ���� �Դϴ�!");
		} else if (point<80&&point >= 70) {
			System.out.println("C ���� �Դϴ�!");
		} else if (point<70&&point >= 60) {
			System.out.println("D ���� �Դϴ�!");
		} else {
			if(point<60&&point>=0) {
			System.out.println("F ���� �Դϴ٤̤�");
			}else {
				System.out.println("�߸��� �Է��Դϴ�.");
			}
		}
	}
}