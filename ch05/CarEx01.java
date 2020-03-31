package ch05;

class Car {
	void run() {
		System.out.println("다시 타고 내려가는 ★동적바인딩★");
	}
}

class Sonata extends Car {
	// 부모것을 무효화
	void run() {
		super.run();// 부모꺼를 다시 이 영역안에서 불러서 씀
		System.out.println(" 쏘나타만의 움직임");
	}
}

public class CarEx01 {

	public static void main(String[] args) {
		Car s1 = new Sonata();
		s1.run();
	}

}
