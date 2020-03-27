package ch01;

public class OperEx02 {

	public static void main(String[] args) {
		int sum = 0; // int 선언하면 값은 0 이 되어있음.
		int distance = 100;
		int move = 20;

		sum = sum + move;
		System.out.println(sum);
		sum = sum + move;
		System.out.println(sum);
		sum = sum + move;
		System.out.println(sum);
		sum = sum + move;
		System.out.println(sum);
		sum = sum + move;
		System.out.println("움직인거리 : "+sum);
		System.out.println("도착지 : "+distance);// +는 숫자를 더하는 용도 , 문자를 더하는 용도로 쓰임!!

	}

}
