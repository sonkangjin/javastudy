package ch05;

abstract class Animal {
	abstract String name();
}

class Mouse extends Animal {

	final String NAME = "������";

	String name() {

		return NAME;
	}
}

class Dog extends Animal {
	final String NAME = "�����";

	String name() {
		return NAME;

	}

}

class Cat extends Animal {
	final String NAME = "�Ŀ���";

	String name() {

		return NAME;
	}
}

class Bird extends Animal {
	final String NAME = "±±��";

	String name() {

		return NAME;
	}
}

public class AnimalEx01 {

	static void attack(Animal u1, Animal u2) {

		System.out.println(u2.name() + " �� " + u1.name() + " ���� ���� ���߽��ϴ�");
	}

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Cat c1 = new Cat();
		Bird b1 = new Bird();
		Mouse m1 = new Mouse();

		System.out.println(d1.NAME + " ź��");
		System.out.println(c1.NAME + " ź��");
		System.out.println(b1.NAME + " ź��");
		System.out.println(m1.NAME + " ź��");
		// ������ vs �����
		attack(d1, c1);
		// ������ vs ��
		attack(d1, b1);
		// ����� vs ��
		attack(c1, b1);
		//�� vs ��
		attack(m1,b1);
	}

}
