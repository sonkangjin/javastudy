package array03;

import java.util.Scanner;

public class Gugudan2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �����մϴ�.");
		boolean confirm = true;
		while (confirm) {
			System.out.println("���ڸ� �Է��ϼ���.");
			int num = sc.nextInt();
			for (int i = 1; i < 10; i++) {
				System.out.println(num + "x" + i + " = " + num * i);
			}
			System.out.println("��� �����ұ��?? Y or N");
			String check = sc.next();
			if (check.equals("N")) {
				// break;// ���� ����� �ں��� Ż��
				confirm = false;
			}
		} // end of while
		System.out.println("������ ���α׷� ����");
	}// end of main

}
