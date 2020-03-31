package ch05;

abstract class Food1 {
	abstract void eat();
}

class 라면1 extends Food1 {
	String name = "라면";

	void eat() {
		System.out.println(name + "을 먹었습니다. 냐미냐미");
	}
}
class 불고기1 extends Food1 {
	String name = "불고기";

	void eat() {
		System.out.println(name + "을 먹었습니다. 냐미냐미");
	}

}
class 갈비1 extends Food1 {
	String name = "갈비";

	void eat() {
		System.out.println(name + "을 먹었습니다. 냐미냐미");
	}
}
public class FoodEx01 {
	
	static void start(Food1 f) {
		f.eat();
	}
	public static void main(String[] args) {
		start(new 불고기1());
		
	}

}
