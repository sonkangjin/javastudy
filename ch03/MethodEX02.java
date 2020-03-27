package ch03;

class Data {
	int num = 10;
}

public class MethodEX02 {
	// 전역공간 ( 스텍안에 없으면 다 전역공간

	static int 증가(int num) {
		num++;
		System.out.println(num);
		return num; // void 지우고 리턴하면 값을 저장!
	}

	static void 감소(Data d) {
		d.num--;
		System.out.println(d.num);
	}

	public static void main(String[] args) {
		// value passing
		int myNum = 100;
		myNum = 증가(myNum);// 다시 마이넘으로 받아줌
		System.out.println(myNum);

		// reference passing
		Data d = new Data();//클래스를 뉴 하면 스테이틱 아닌게 메모리에 다 뜸
		감소(d);// 힙 영역에서 관리하는 값이기에 변환된 값 그대로
		System.out.println(d.num);

	}

}
