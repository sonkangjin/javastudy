package array03;

import java.util.Scanner;

public class ArrayEx08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 대문자를 입력하세요");
		String a = sc.next();

		String input = a;
		char c = input.charAt(0);

		for (int i = (int) c + 1; i < 91; i++) {

			System.out.print((char) i + " ");
		}

	}

}
