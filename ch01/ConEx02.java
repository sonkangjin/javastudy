package ch01;

import java.util.Scanner;

public class ConEx02 {

	public static void main(String[] args) {
		System.out.println("성적을 입력하세요 :");
		Scanner sc = new Scanner(System.in);
		int point = sc.nextInt();

		if (point >= 90) {
			System.out.println("A 학점 입니다!");
		} else if (point >= 80) {
			System.out.println("B 학점 입니다!");
		} else if (point >= 70) {
			System.out.println("C 학점 입니다!");
		} else if (point >= 60) {
			System.out.println("D 학점 입니다!");
		} else {
			System.out.println("F 학점 입니다ㅜㅜ");
		}
	}
}
