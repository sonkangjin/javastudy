package ch03;

public class Mem {

	int num = 10;// 전역변수

	static String name = "홍길동";

	void test() {
		int num = 5;// 지역변수
	}

	public static void main(String[] args) {
		int sum = 100;
		System.out.println(sum);
		Mem m = new Mem();
		m.test();
		System.out.println("번호 : " + m.num);
		System.out.println(1);
		System.out.println(2);
		System.out.println("프로그램 종료");

	}

}
