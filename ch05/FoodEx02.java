package ch05;

abstract class Food {
	abstract void standby();
	
	void eat() {
		System.out.println("������ �Ծ����ϴ�. �ȳ�");
	}

	abstract void cook();

	void auto() {
		standby();
		cook();
		eat();
	}
}

class ��� extends Food {
	String name = "���";
	@Override
	void cook() {
		System.out.println("���ۺ��� ���δ�.");

	}

	@Override
	void standby() {
		System.out.println("���� ���� �غ�");

	}

}

class ���� extends Food {
	String name = "����";
	@Override
	void cook() {
		System.out.println("���ǿ� ���´�.");

	}

	@Override
	void standby() {
		System.out.println("����� ������ �غ�");

	}

}

public class FoodEx02 {

	static void start(Food f) {
		f.auto();

	}

	public static void main(String[] args) {
		start(new ���());
		start(new ����());
	}

}
