package array03;

import java.util.Scanner;

public class Gugudan2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단을 시작합니다.");
		boolean confirm = true;
		while (confirm) {
			System.out.println("숫자를 입력하세요.");
			int num = sc.nextInt();
			for (int i = 1; i < 10; i++) {
				System.out.println(num + "x" + i + " = " + num * i);
			}
			System.out.println("계속 진행할까요?? Y or N");
			String check = sc.next();
			if (check.equals("N")) {
				// break;// 가장 가까운 박본문 탈출
				confirm = false;
			}
		} // end of while
		System.out.println("구구단 프로그램 종료");
	}// end of main

}
