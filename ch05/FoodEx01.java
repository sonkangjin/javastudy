package ch05;

abstract class Food1 {
	abstract void eat();
}

class ���1 extends Food1 {
	String name = "���";

	void eat() {
		System.out.println(name + "�� �Ծ����ϴ�. �Ĺ̳Ĺ�");
	}
}
class �Ұ��1 extends Food1 {
	String name = "�Ұ��";

	void eat() {
		System.out.println(name + "�� �Ծ����ϴ�. �Ĺ̳Ĺ�");
	}

}
class ����1 extends Food1 {
	String name = "����";

	void eat() {
		System.out.println(name + "�� �Ծ����ϴ�. �Ĺ̳Ĺ�");
	}
}
public class FoodEx01 {
	
	static void start(Food1 f) {
		f.eat();
	}
	public static void main(String[] args) {
		start(new �Ұ��1());
		
	}

}
