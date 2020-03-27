package array03;

import java.util.Scanner;

public class ArrayEx06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("6자리 숫자를 입력하세요.");
		int num = sc.nextInt();

		String strNum = num + "";
		System.out.println(strNum.charAt(2));// 위치에 있는 숫자 찾기
		System.out.println(strNum.length());// 길이 출력

		int a = 0;
		for (int i = 0; i < strNum.length(); i++) {
			if (strNum.charAt(i) == '3') {
				a++;
			}
		}
		if (a > 0) {
			System.out.println("3이 존재합니다.");
		} else {
			System.out.println("3이 존재하지 않습니다.");
		}
	}

}
